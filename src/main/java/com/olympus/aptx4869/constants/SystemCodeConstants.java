package com.olympus.aptx4869.constants;

import org.apache.commons.lang3.StringUtils;

public class SystemCodeConstants {

	/** エンコード */
	public static final String CHARACTER_ENCODING = "UTF-8";

	public static final String PLEASE_SELECT_MSG = "－－－選択してください－－－";

	public static final String ENABLED = "有効";
	public static final String DISABLE = "無効";

	public static class PATTERN {
		public static final String NUMERIC = "0-9";
		public static final String ALPHABET_LOWERCASE = "a-z";
		public static final String ALPHABET_UPPERCASE = "A-Z";
		public static final String AMOUNT_PATTERN = "^[0-9]{0,9}$";
	}

	public static final int SUPPLEMENT_LENGTH = 20;

	public static enum MoneyReceptionFlag {

		INCOME(true, "収入"),
		EXPENSE(false, "支出");

		public boolean getValue() {
			return value;
		}
		public String getLabel() {
			return label;
		}

		final boolean value;
		final String label;

		private MoneyReceptionFlag(boolean value, String label) {
			this.value = value;
			this.label = label;
		}
	}

	public static enum SettlementDate {
		FIVE(5, "5日"),
		TEN(10, "10日"),
		FIFTEEN(15, "15日"),
		TWENTY(20, "20日"),
		TWENTY_FIVE(25, "25日"),
		LAST_OF_MONTH(99, "月末");

		final Integer value;
		final String label;

		public Integer getValue() {
			return value;
		}

		public String getLabel() {
			return label;
		}

		private SettlementDate(Integer value, String label) {
			this.value = value;
			this.label = label;
		}

		public static SettlementDate getByValue(Integer value){

			for(SettlementDate settlementDate : SettlementDate.values()) {
				if (settlementDate.value.compareTo(value) == 0) {
					return settlementDate;
				}
			}

			return null;
		}
	}

	/**
	 * 有効終了日が設定されていない場合の定数
	 */
	public static class EffectiveEndDateCode {
		public static final String EFFECTIVE_END_DATE = "-";
	}

	/**
	 * アプリ用：日別登録件数の定数クラス。
	 */
	public static class MoneyReceptionRecord {
		/** 支出登録件数の定数*/
		public static final int SPENDING_RECORD = 10;
		/** 収入登録件数の定数*/
		public static final int INCOME_RECORD = 5;
		/** 収支合計件数の定数*/
		public static final int MONEY_RECEPTION_RECORD = SPENDING_RECORD + INCOME_RECORD;
	}

	/**
	 * アプリ用：日別登録件数の定数クラス。
	 */
	public static class RegularlyMoney {
		/** 支出登録件数の定数*/
		public static final int SPENDING_RECORD = 5;
		/** 収入登録件数の定数*/
		public static final int INCOME_RECORD = 5;
		/** 収支合計件数の定数*/
		public static final int REGULARLY_MONEY_RECORD = SPENDING_RECORD + INCOME_RECORD;
	}

	/**
	 * メッセージタイプ。
	 */
	public static class MessageType {
		/** 成功 */
		public static final String SUCCESS = "successMessages";
		/** 通知 */
		public static final String INFO = "infoMessages";
		/** 警告 */
		public static final String WARN = "warnMessages";
		/** エラー */
		public static final String ERROR = "errorMessages";
	}

	/**
	 * フラグ関連定数。
	 */
	public enum Flag {
		ON("1", 1, true, "true"),
		OFF("0", 0, false, "false");

		final String stringValue;
		final Integer integerValue;
		final boolean boolValue;
		final String boolStrValue;

		private Flag(String stringValue, Integer integerValue, boolean boolValue, String boolStrValue) {
			this.stringValue = stringValue;
			this.integerValue = integerValue;
			this.boolValue = boolValue;
			this.boolStrValue = boolStrValue;
		}

		public static Flag getFlagByIntegerValue(Integer integerValue){

			for(Flag flag : Flag.values()) {
				if (flag.getIntegerValue().compareTo(integerValue) == 0) {
					return flag;
				}
			}

			return OFF;
		}

		public static Flag getFlagByStringValue(String value){

			for(Flag flag : Flag.values()) {
				if (StringUtils.equals(flag.getStringValue(), value)) {
					return flag;
				}
			}

			return null;
		}
		public static Flag getFlagByBooleanValue(Boolean value){

			if (value == null) {
				return null;
			}

			for(Flag flag : Flag.values()) {
				if (flag.boolValue == value) {
					return flag;
				}
			}

			return null;
		}

		public static Flag getFlagByBooleanStrValue(String value){

			for(Flag flag : Flag.values()) {
				if (StringUtils.equals(flag.getBoolStrValue(), value)) {
					return flag;
				}
			}

			return null;
		}

		/**
		 * stringValueを取得。
		 * @return stringValue
		 */
		public String getStringValue() {
			return stringValue;
		}
		/**
		 * integerValueを取得。
		 * @return integerValue
		 */
		public Integer getIntegerValue() {
			return integerValue;
		}
		/**
		 * boolValueを取得。
		 * @return boolValue
		 */
		public boolean isBoolValue() {
			return boolValue;
		}

		public String getBoolStrValue() {
			return boolStrValue;
		}

	}
}
