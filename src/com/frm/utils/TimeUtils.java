package com.frm.utils;

import java.util.Calendar;

/**
 * @author LinHuanZhi
 * @time 2021年12月12日
 * @email lhz034069@163.com
 * @description
 */
public class TimeUtils {

	/**
	 * @return
	 * @description
	 */
	public static long curMillis() {
		return System.currentTimeMillis();
	}

	/**
	 * @param ms
	 * @return
	 * @description ms 差值
	 */
	public static long MillisDiff(long ms) {
		return curMillis() - ms;
	}

	public static String generateYYMMDDHHMMSS() {
		Calendar cal = Calendar.getInstance();
		// 当前年
		int year = cal.get(Calendar.YEAR);
		// 当前月
		int month = cal.get(Calendar.MONTH) + 1;
		// 当前日
		int day = cal.get(Calendar.DATE);
		// 当前小时
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		// 当前分钟
		int minute = cal.get(Calendar.MINUTE);
		// 当前秒
		int second = cal.get(Calendar.SECOND);
//		return year + "-" + month + "-" + day + "_" + hour + "-" + minute + "-" + second + "___";
		return year + "" + month + "" + day + "" + hour + "_" + minute + "-" + second + "___";
	}

}
