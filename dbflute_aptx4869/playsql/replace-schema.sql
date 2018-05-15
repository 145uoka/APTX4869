
/* Drop Tables */

DROP TABLE IF EXISTS aptx4869.OAUTH_PROPERTY_M;
DROP TABLE IF EXISTS aptx4869.property_m;
DROP TABLE IF EXISTS aptx4869.user_m;




/* Create Tables */

-- OAuthプロパティ_M
CREATE TABLE aptx4869.OAUTH_PROPERTY_M
(
	-- OAuthプロパティID
	oauth_property_id serial NOT NULL,
	-- アプリケーションKEY
	app_key text NOT NULL,
	-- OAuth認証後のcallbackURL
	redirect_url text NOT NULL,
	-- クライアントID
	client_id text NOT NULL,
	-- クライアントSECRET
	client_secret text NOT NULL,
	-- 削除フラグ
	delete_flag boolean DEFAULT 'false' NOT NULL,
	-- 登録日時
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	-- 更新日時
	update_datetime timestamp(3),
	PRIMARY KEY (oauth_property_id)
) WITHOUT OIDS;


CREATE TABLE aptx4869.property_m
(
	-- プロパティID
	property_id serial NOT NULL,
	-- プロパティ名
	prop_name text NOT NULL UNIQUE,
	-- プロパティ値
	prop_val text,
	-- プロパティグループ名
	prop_group_name text,
	-- 削除フラグ
	delete_flag boolean DEFAULT 'false' NOT NULL,
	-- 登録日時
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	-- 更新日時
	update_datetime timestamp(3),
	PRIMARY KEY (property_id)
) WITHOUT OIDS;


-- ユーザー_M
CREATE TABLE aptx4869.user_m
(
	-- ユーザーID
	user_id serial NOT NULL,
	-- LINE_ID
	line_id text,
	-- LINE表示名
	line_name text,
	-- LINEのEmail
	line_email text,
	-- 名
	first_name text,
	-- 姓
	last_name text,
	-- ハンドル名
	handle_name text,
	-- 最終ログイン日時
	last_login_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP,
	-- 削除フラグ
	delete_flag boolean DEFAULT 'false' NOT NULL,
	-- 登録日時
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	-- 更新日時
	update_datetime timestamp(3),
	PRIMARY KEY (user_id)
) WITHOUT OIDS;



/* Comments */

COMMENT ON TABLE aptx4869.OAUTH_PROPERTY_M IS 'OAuthプロパティ_M';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.oauth_property_id IS 'OAuthプロパティID';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.app_key IS 'アプリケーションKEY';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.redirect_url IS 'OAuth認証後のcallbackURL';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.client_id IS 'クライアントID';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.client_secret IS 'クライアントSECRET';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.delete_flag IS '削除フラグ';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.register_datetime IS '登録日時';
COMMENT ON COLUMN aptx4869.OAUTH_PROPERTY_M.update_datetime IS '更新日時';
COMMENT ON COLUMN aptx4869.property_m.property_id IS 'プロパティID';
COMMENT ON COLUMN aptx4869.property_m.prop_name IS 'プロパティ名';
COMMENT ON COLUMN aptx4869.property_m.prop_val IS 'プロパティ値';
COMMENT ON COLUMN aptx4869.property_m.prop_group_name IS 'プロパティグループ名';
COMMENT ON COLUMN aptx4869.property_m.delete_flag IS '削除フラグ';
COMMENT ON COLUMN aptx4869.property_m.register_datetime IS '登録日時';
COMMENT ON COLUMN aptx4869.property_m.update_datetime IS '更新日時';
COMMENT ON TABLE aptx4869.user_m IS 'ユーザー_M';
COMMENT ON COLUMN aptx4869.user_m.user_id IS 'ユーザーID';
COMMENT ON COLUMN aptx4869.user_m.line_id IS 'LINE_ID';
COMMENT ON COLUMN aptx4869.user_m.line_name IS 'LINE表示名';
COMMENT ON COLUMN aptx4869.user_m.line_email IS 'LINEのEmail';
COMMENT ON COLUMN aptx4869.user_m.first_name IS '名';
COMMENT ON COLUMN aptx4869.user_m.last_name IS '姓';
COMMENT ON COLUMN aptx4869.user_m.handle_name IS 'ハンドル名';
COMMENT ON COLUMN aptx4869.user_m.last_login_datetime IS '最終ログイン日時';
COMMENT ON COLUMN aptx4869.user_m.delete_flag IS '削除フラグ';
COMMENT ON COLUMN aptx4869.user_m.register_datetime IS '登録日時';
COMMENT ON COLUMN aptx4869.user_m.update_datetime IS '更新日時';



