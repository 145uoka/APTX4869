package com.olympus.aptx4869.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olympus.aptx4869.constants.PropertyNameConstants;
import com.olympus.aptx4869.constants.PropertyNameConstants.OAuth;
import com.olympus.aptx4869.constants.SystemCodeConstants;
import com.olympus.aptx4869.dbflute.exbhv.OauthPropertyMBhv;
import com.olympus.aptx4869.dbflute.exbhv.UserMBhv;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.OAuthTokenDto;
import com.olympus.aptx4869.dto.PropertyDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.GetTokenRequestForm;

@Service
public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    OauthPropertyMBhv oauthPropertyMBhv;

    @Autowired
    PropertyService propertyService;

    @Autowired
    UserMBhv userMBhv;

    public String getOauthUrl() throws NotFoundRecordException {

        ArrayList<PropertyDto> propertyDtoList =
                propertyService.findPropertyGroup(PropertyNameConstants.OAuth.GROUP_NAME);

        PropertyDto propertyDto = propertyService.getPropertyDtoForGroup(propertyDtoList, OAuth.Name.APP_KEY);

        if (propertyDto == null) {
            throw new NotFoundRecordException("プロパティ_M", OAuth.Name.APP_KEY);
        }
        String appKey = propertyDto.getPropVal();

        propertyDto = propertyService.getPropertyDtoForGroup(propertyDtoList, OAuth.Name.REDIRECT_URL);

        if (propertyDto == null) {
            throw new NotFoundRecordException("プロパティ_M", OAuth.Name.REDIRECT_URL);
        }

        String redirectUrl = propertyDto.getPropVal();

        propertyDto = propertyService.getPropertyDtoForGroup(propertyDtoList, OAuth.Name.OAUTH_EX_URL);

        if (propertyDto == null) {
            throw new NotFoundRecordException("プロパティ_M", OAuth.Name.OAUTH_EX_URL);
        }

        String oauthUrl = propertyDto.getPropVal();

        String state = "hoge";

        StringBuilder sb = new StringBuilder();
        sb.append(oauthUrl);
        sb.append("/");
        sb.append(appKey);
        sb.append("?state=");
        sb.append(state);
        sb.append("&exRedirectUrl=");
        sb.append(redirectUrl);

        return sb.toString();
    }

//    public IdTokenDto createIdTokenDto(String id_token) {
//        try {
//            DecodedJWT jwt = JWT.decode(id_token);
//            return new IdTokenDto(
//                    jwt.getClaim("iss").asString(),
//                    jwt.getClaim("sub").asString(),
//                    jwt.getClaim("aud").asString(),
//                    jwt.getClaim("ext").asLong(),
//                    jwt.getClaim("iat").asLong(),
//                    jwt.getClaim("nonce").asString(),
//                    jwt.getClaim("name").asString(),
//                    jwt.getClaim("picture").asString(),
//                    jwt.getClaim("email").asString());
//        } catch (JWTDecodeException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public LoginUserDto login(OAuthTokenDto oAuthTokenDto) {

        LoginUserDto loginUserDto = new LoginUserDto();

        OptionalEntity<UserM> optionalEntity = userMBhv.selectEntity(cb->{
            cb.query().setLineId_Equal(oAuthTokenDto.getLineId());
        });

        if (optionalEntity.isPresent()) {
            UserM userM = optionalEntity.get();
            userM.setLastLoginDatetime(LocalDateTime.now());
            userM.setLineName(oAuthTokenDto.getLineName());
            userM.setLineEmail(oAuthTokenDto.getLineEmail());
            userMBhv.update(userM);

            BeanUtils.copyProperties(userM, loginUserDto);
        } else {
            UserM userM = new UserM();
            userM.setLineId(oAuthTokenDto.getLineId());
            userM.setLastLoginDatetime(LocalDateTime.now());
            userM.setLineName(oAuthTokenDto.getLineName());
            userM.setLineEmail(oAuthTokenDto.getLineEmail());

            userMBhv.insert(userM);

            BeanUtils.copyProperties(userM, loginUserDto);
        }
        loginUserDto.setLoginFlg(true);

        return loginUserDto;
    }

    public OAuthTokenDto getToken(String code) throws NotFoundRecordException, ParseException, IOException {

//        List<NameValuePair> params = new ArrayList<NameValuePair>();

        ArrayList<PropertyDto> propertyDtoList =
                propertyService.findPropertyGroup(PropertyNameConstants.OAuth.GROUP_NAME);

        OAuthTokenDto oAuthTokenDto = null;

        ObjectMapper mapper = new ObjectMapper();
        GetTokenRequestForm getTokenRequestForm = new GetTokenRequestForm();
        getTokenRequestForm.setClientId(propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.CLIENT_ID, false));
        getTokenRequestForm.setClientSecret(propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.CLIENT_SECRET, false));
        getTokenRequestForm.setCode(code);
        getTokenRequestForm.setAppKey(propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.APP_KEY, false));
        String requestJson = mapper.writeValueAsString(getTokenRequestForm);

//        params.add(new BasicNameValuePair("clientId",
//                propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.CLIENT_ID, false)));
//
//        params.add(new BasicNameValuePair("clientSecret",
//                propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.CLIENT_SECRET, false)));
//
//        params.add(new BasicNameValuePair("code", code));

        HttpPost httpPost =
                new HttpPost(propertyService.getPropValueForGroup(propertyDtoList, OAuth.Name.API_URL_GET_TOKEN, true));

//        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, SystemCodeConstants.CHARACTER_ENCODING);
//        httpPost.setEntity(formEntity);
        httpPost.setHeader("Content-type", "application/json; charset=UTF-8");
        StringEntity entity = new StringEntity(requestJson, "UTF-8");
        httpPost.setEntity(entity);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = httpClient.execute(httpPost);

        String responseJson = EntityUtils.toString(httpResponse.getEntity(), SystemCodeConstants.CHARACTER_ENCODING);
        if (logger.isDebugEnabled()) {
            logger.debug("json = " + responseJson);
        }

        JsonNode node = mapper.readTree(responseJson);

        oAuthTokenDto = new OAuthTokenDto();
        oAuthTokenDto.setLineEmail(node.get("lineEmail").asText());
        oAuthTokenDto.setLineName(node.get("lineName").asText());
        oAuthTokenDto.setLineId(node.get("lineId").asText());

        return oAuthTokenDto;
    }


}
