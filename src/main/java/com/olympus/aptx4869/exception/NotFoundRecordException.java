package com.olympus.aptx4869.exception;

public class NotFoundRecordException extends Exception{

    public NotFoundRecordException() {
        super();
    }

    public NotFoundRecordException(String message) {
        super(message);
    }

    public NotFoundRecordException(String tableName, String key) {
        super("テーブル[" + tableName + "]が見つかりませんでした。 key = [" + key + "]");
    }
}
