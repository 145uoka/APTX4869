/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.olympus.aptx4869.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public final class IdTokenDto {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /** チャネルID */
    private String aud;

    /** ユーザーのメールアドレス。認可リクエストにemailスコープを指定しなかった場合は含まれません。 */
    private String email;

    /** トークンの有効期限。UNIXタイムです。 */
    private Long exp;

    /** IDトークンの生成時間。UNIXタイムです。 */
    private Long iat;

    /** https://access.line.me。IDトークンの生成URLです。 */
    private String iss;

    /** ユーザーの表示名。認可リクエストにprofileスコープを指定しなかった場合は含まれません。 */
    private String name;

    /** 認可URLに指定したnonceの値。認可リクエストにnonceの値を指定しなかった場合は含まれません。 */
    private String nonce;

    /** ユーザープロフィールの画像URL。認可リクエストにprofileスコープを指定しなかった場合は含まれません。 */
    private String picture;

    /** IDトークンの対象ユーザーID */
    private String sub;

    /**
     * チャネルIDの取得。
     *
     * @return チャネルID
     */
    public String getAud() {
        return this.aud;
    }

    /**
     * チャネルIDを設定。
     *
     * @param aud チャネルID
     */
    public void setAud(String aud) {
        this.aud = aud;
    }

    /**
     * ユーザーのメールアドレス。認可リクエストにemailスコープを指定しなかった場合は含まれません。の取得。
     *
     * @return ユーザーのメールアドレス。認可リクエストにemailスコープを指定しなかった場合は含まれません。
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * ユーザーのメールアドレス。認可リクエストにemailスコープを指定しなかった場合は含まれません。を設定。
     *
     * @param email ユーザーのメールアドレス。認可リクエストにemailスコープを指定しなかった場合は含まれません。
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * トークンの有効期限。UNIXタイムです。の取得。
     *
     * @return トークンの有効期限。UNIXタイムです。
     */
    public Long getExp() {
        return this.exp;
    }

    /**
     * トークンの有効期限。UNIXタイムです。を設定。
     *
     * @param exp トークンの有効期限。UNIXタイムです。
     */
    public void setExp(Long exp) {
        this.exp = exp;
    }

    /**
     * IDトークンの生成時間。UNIXタイムです。の取得。
     *
     * @return IDトークンの生成時間。UNIXタイムです。
     */
    public Long getIat() {
        return this.iat;
    }

    /**
     * IDトークンの生成時間。UNIXタイムです。を設定。
     *
     * @param iat IDトークンの生成時間。UNIXタイムです。
     */
    public void setIat(Long iat) {
        this.iat = iat;
    }

    /**
     * https://access.line.me。IDトークンの生成URLです。の取得。
     *
     * @return https://access.line.me。IDトークンの生成URLです。
     */
    public String getIss() {
        return this.iss;
    }

    /**
     * https://access.line.me。IDトークンの生成URLです。を設定。
     *
     * @param iss https://access.line.me。IDトークンの生成URLです。
     */
    public void setIss(String iss) {
        this.iss = iss;
    }

    /**
     * ユーザーの表示名。認可リクエストにprofileスコープを指定しなかった場合は含まれません。の取得。
     *
     * @return ユーザーの表示名。認可リクエストにprofileスコープを指定しなかった場合は含まれません。
     */
    public String getName() {
        return this.name;
    }

    /**
     * ユーザーの表示名。認可リクエストにprofileスコープを指定しなかった場合は含まれません。を設定。
     *
     * @param name ユーザーの表示名。認可リクエストにprofileスコープを指定しなかった場合は含まれません。
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 認可URLに指定したnonceの値。認可リクエストにnonceの値を指定しなかった場合は含まれません。の取得。
     *
     * @return 認可URLに指定したnonceの値。認可リクエストにnonceの値を指定しなかった場合は含まれません。
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * 認可URLに指定したnonceの値。認可リクエストにnonceの値を指定しなかった場合は含まれません。を設定。
     *
     * @param nonce 認可URLに指定したnonceの値。認可リクエストにnonceの値を指定しなかった場合は含まれません。
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * ユーザープロフィールの画像URL。認可リクエストにprofileスコープを指定しなかった場合は含まれません。の取得。
     *
     * @return ユーザープロフィールの画像URL。認可リクエストにprofileスコープを指定しなかった場合は含まれません。
     */
    public String getPicture() {
        return this.picture;
    }

    /**
     * ユーザープロフィールの画像URL。認可リクエストにprofileスコープを指定しなかった場合は含まれません。を設定。
     *
     * @param picture ユーザープロフィールの画像URL。認可リクエストにprofileスコープを指定しなかった場合は含まれません。
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * IDトークンの対象ユーザーIDの取得。
     *
     * @return IDトークンの対象ユーザーID
     */
    public String getSub() {
        return this.sub;
    }

    /**
     * IDトークンの対象ユーザーIDを設定。
     *
     * @param sub IDトークンの対象ユーザーID
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

}

