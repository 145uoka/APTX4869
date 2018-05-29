package com.olympus.aptx4869.controller;

import java.util.List;
import java.util.Locale;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.common.util.MessageKeyUtil;
import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.constants.MessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MessageType;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.LabelValueDto;
import com.olympus.aptx4869.dto.MoneyReceptionDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.MoneyReceptionForm;
import com.olympus.aptx4869.service.GenreService;
import com.olympus.aptx4869.service.LoggerService;
import com.olympus.aptx4869.service.MoneyReceptionService;

/**
 * 支出・収入登録画面のコントローラー．
 *
 * @author hasegawa_m
 *
 */
@Controller
public class MoneyReceptionController extends BaseController{

    /** ログを扱う */
    @Autowired
    LoggerService loggerService;

    @Autowired
    GenreService genreService;

    @Autowired
    MoneyReceptionService moneyReceptionService;



	/**
	 * 金銭授受登録画面の初期表示コントローラー．
	 * @param locale locale
	 * @param model model
	 * @return 登録画面
	 * @throws NotFoundRecordException レコード取得エラー
	 */
	@RequestMapping(value = "/moneyReception/create/{paramUserId}", method = {RequestMethod.GET, RequestMethod.POST})
	public String create(@PathVariable String paramUserId, Locale locale, Model model) throws NotFoundRecordException{

        Integer userId = Integer.parseInt(paramUserId);
        OptionalEntity<UserM> userMEntity = moneyReceptionService.findUserMEntity(userId);

        if(!userMEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"ユーザーマスタ", userId});
            throw new NotFoundRecordException();
        }

	    MoneyReceptionForm form = new MoneyReceptionForm();
	    form.setUserId(paramUserId);

	    form.setMoneyReceptionDate("2018/05/30");

        // プルダウンを表示する。
        List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
        model.addAttribute("selectGenreList", selectGenreList);

        // form情報をModelへ格納。
        model.addAttribute("form", form);

		return "money/create";
	}

	/**
     * 金銭授受登録処理用コントローラー．
     *
     * @param form 登録情報フォーム
     * @param bindingResult 入力エラー情報
     * @param locale Locale情報
     * @param model Model
     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
     * @return 正常終了:詳細画面, エラー有:登録画面
     */
    @RequestMapping(value = "/moneyReception/store", method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") MoneyReceptionForm form, BindingResult bindingResult,
            Locale locale, Model model, RedirectAttributes redirectAttributes) {

        // form情報をModelへ格納
        model.addAttribute("form", form);

        // validation確認
        if (bindingResult.hasErrors()) {

            // エラーメッセージをform:errorsに格納。
            model.addAttribute("errors", bindingResult);

            // プルダウンをエラー後も表示する。
            List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
            model.addAttribute("selectGenreList", selectGenreList);

            // 入力エラーが存在すれば、登録画面を再描画
            return "/moneyReception/create";
        }

        // 登録処理
        MoneyReceptionDto dto = new MoneyReceptionDto();
        convertMoneyReseptionFromToDto(form, dto);

        MoneyReception moneyReceptionEntity = moneyReceptionService.store(dto);

        // 登録処理ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0004,
                new Object[]{"金銭授受", moneyReceptionEntity.getMoneyReceptionId()});

        // 登録完了メッセージを表示。
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, message);

        // 登録完了後、詳細画面へ遷移。
        return "redirect:/money/detail" + form.getMoneyReceptionId();
    }


//    /**
//     * 金銭授受修正画面の初期表示コントローラー．
//     *
//     * @param paramMoneyReceptionId 金銭授受ID
//     * @param locale Locale
//     * @param model Model
//     * @return 修正画面
//     * @throws NotFoundRecordException レコード取得エラー
//     */
//    @RequestMapping(value = "/moneyReception/{paramMoneyReceptionId}/edit/", method = RequestMethod.GET)
//    public String edit(@PathVariable String paramMoneyReceptionId, Locale locale, Model model) throws NotFoundRecordException{
//
//        Long moneyReceptionId = Long.parseLong(paramMoneyReceptionId);
//
//        OptionalEntity<MoneyReception> moneyReceptionEntity = moneyReceptionService.findMoneyReceptionEntity(moneyReceptionId);
//
//        // レコードの有無を確認。
//        if (moneyReceptionEntity.isPresent()) {
//            // 金銭授受_Tのentity取得
//            MoneyReception entity = moneyReceptionEntity.get();
//
//            // formに各要素をString型でセット。
//            MoneyReceptionForm form = new MoneyReceptionForm();
//            BeanUtils.copyProperties(entity, form);
//            form.setMoneyReceptionId(paramMoneyReceptionId);
//            form.setUserId(String.valueOf(entity.getUserId()));
//            form.setGenreId(String.valueOf(entity.getGenreId()));
//            form.setAmount(String.valueOf(entity.getAmount()));
//            form.setMoneyReceptionDate(DateUtil.date2DisplayStr(entity.getMoneyReceptionDate()));
//
//            if(entity.getMoneyReceptionFlag()){
//                //Flagがtrueであれば、"income"をセット。
//                form.setMoneyReceptionFlag("income");
//
//            }else{
//              //Flagがfalseであれば、"spending"をセット。
//                form.setMoneyReceptionFlag("spending");
//            }
//
//            // プルダウンを表示する。
//            List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(false,SystemCodeConstants.PLEASE_SELECT_MSG);
//            model.addAttribute("selectGenreList", selectGenreList);
//
//            // form情報をModelへ格納
//            model.addAttribute("form", form);
//
//        } else {
//            // 対象レコードが見つからない場合、エラー画面へ遷移。
//            loggerService.outLog("W_99_0001", new Object[]{"金銭授受_T", paramMoneyReceptionId});
//            throw new NotFoundRecordException();
//        }
//
//        return "/edit";
//    }
//
//    /**
//     * 金銭授受更新処理用コントローラー．
//     *
//     * @param form 入力情報
//     * @param bindingResult
//     * @param locale Locale
//     * @param model Model
//     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
//     * @return 正常終了:詳細画面, エラー有:編集画面
//     * @throws NotFoundRecordException レコード取得エラー
//     */
//    @RequestMapping(value = "/moneyReception/update", method = RequestMethod.POST)
//    public String update(@Validated @ModelAttribute("form") MoneyReceptionForm form, BindingResult bindingResult,
//            Locale locale, Model model, RedirectAttributes redirectAttributes) throws NotFoundRecordException{
//
//        // form情報をModelへ格納
//        model.addAttribute("form", form);
//
//        if(StringUtils.isNotEmpty(form.getMoneyReceptionDate())){
//            if(!DateUtil.isValidDateFormat(form.getMoneyReceptionDate())){
//                //日付に変換できなければ、エラー
//                String message = messageSource.getMessage(
//                        MessageKeyUtil.encloseStringDelete(MessageKeyConstants.CustomValidators.DATEFORMAT_MESSAGE),
//                        new Object[]{DateUtil.DATE_TIME_FORMAT_YYYYMM}, Locale.getDefault());
//                bindingResult.rejectValue("moneyReceptionDate",null, null, message);
//            }
//        }
//
//        // validation確認
//        if (bindingResult.hasErrors()) {
//
//            // エラーメッセージをform:errorsに格納。
//            model.addAttribute("errors", bindingResult);
//
//            // プルダウンをエラー後も表示する。
//            List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
//            model.addAttribute("selectGenreList", selectGenreList);
//
//            // 入力エラーが存在すれば、登録画面を再描画
//            return "/moneyReception/edit";
//        }
//
//        // 更新処理
//        MoneyReceptionDto dto = new MoneyReceptionDto();
//        convertMoneyReseptionFromToDto(form, dto);
//        dto.setMoneyReceptionId(Long.parseLong(form.getMoneyReceptionId()));
//
//        MoneyReception moneyReceptionEntity = moneyReceptionService.update(dto);
//
//        // 更新処理ログ出力
//        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0002,
//                new Object[]{"金銭授受", moneyReceptionEntity.getMoneyReceptionId(), ""});
//
//        // 更新完了メッセージを表示。
//        String message = messageSource.getMessage(
//                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.UPDATE), null, Locale.getDefault());
//
//        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, message);
//
//        // イベント詳細画面へ遷移。
//        return "redirect:/money/detail/" + form.getMoneyReceptionId();
//    }
//
//    /**
//     * 金銭授受削除処理用コントローラー．
//     *
//     * @param form 入力情報
//     * @param bindingResult 入力エラー情報
//     * @param locale Locale
//     * @param model  Model
//     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
//     * @return 正常終了:イベント詳細画面, エラー有:エラー画面
//     * @throws NotFoundRecordException レコード情報取得エラー
//     */
//    @RequestMapping(value = "/moneyReception/delete", method = RequestMethod.POST)
//    public String deleteEvent(@Validated @ModelAttribute("form") MoneyReceptionForm form, BindingResult bindingResult,
//            Locale locale, Model model, RedirectAttributes redirectAttributes)
//                    throws NotFoundRecordException {
//
//        if (bindingResult.hasErrors()) {
//            // レコードが取得できなかった場合、エラー画面へ遷移。
//            throw new NotFoundRecordException();
//        }
//
//        // 削除処理
//        moneyReceptionService.delete(Long.parseLong(form.getMoneyReceptionId()));
//
//        // 削除処理ログ出力
//        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0003,
//                new Object[]{"金銭授受", form.getMoneyReceptionId(), ""});
//
//        // 削除完了メッセージを表示
//        String message = messageSource.getMessage(
//                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.DELETE), null, Locale.getDefault());
//        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, message);
//
//        // イベント検索画面へ遷移。
//        return "redirect:/money/detail/" + form.getMoneyReceptionId();
//    }


    /**
     * moneyReseptionFromからdtoを作成する．
     *
     * @param form
     * @param dto
     */
    private void convertMoneyReseptionFromToDto(MoneyReceptionForm form, MoneyReceptionDto dto) {

        dto.setUserId(Integer.parseInt(form.getUserId()));

        if(form.getMoneyReceptionFlag().equals("spending")){
            //支出であれば、Flagはfalseをセット。
            dto.setMoneyReceptionFlag(false);

        }else if(form.getMoneyReceptionFlag().equals("income")){
            //収入であれば、Flagはtrueをセット。
            dto.setMoneyReceptionFlag(true);
        }

        for(int i = 0; i < form.getGenreId().length; i++){
            dto.setGenreId(Integer.parseInt(form.getGenreId()[i]));
            dto.setAmount(Integer.parseInt(form.getAmount()[i]));
            dto.setSupplement(form.getSupplement()[i]);
        }
    }

}
