package com.olympus.aptx4869.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * ログ出力サービス。
 */
@Service
public class LoggerService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MessageSource messageSource;

    /**
     * ログ出力。
     *
     * メッセージIDの先頭文字を基に、ログレベルを設定します。<br>
     * <li>I・・・INFO
     * <li>E・・・ERROR
     * <li>W・・・WARN
     * <li>その他・・・DEBUG
     *
     * @param msgId メッセージID
     * @param args バインドパラメータ
     */
    public void outLog(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());

        if (msgId.startsWith("I")) {
            logger.info(message);
        } else if (msgId.startsWith("W")) {
            logger.warn(message);
        } else if (msgId.startsWith("E")) {
            logger.error(message);
        } else {
            logger.debug(message);
        }
    }

    /**
     * INFOログ出力。
     * @param msgId メッセージID
     * @param args パラメータ
     */
    public void info(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());
        logger.info(message);
    }

    /**
     * WARNログ出力。
     * @param msgId メッセージID
     * @param args パラメータ
     */
    public void warn(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());
        logger.warn(message);
    }

    /**
     * ERRORログ出力。
     * @param msgId メッセージID
     * @param args パラメータ
     */
    public void error(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());
        logger.error(message);
    }

    /**
     * DEBUGログ出力。
     * @param msgId メッセージID
     * @param args パラメータ
     */
    public void debug(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());
        logger.debug(message);
    }
}
