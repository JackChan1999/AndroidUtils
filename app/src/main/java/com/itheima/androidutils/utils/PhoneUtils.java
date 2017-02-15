package com.itheima.androidutils.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：http://blog.csdn.net/axi295309066
 * 微博：AndroidDeveloper
 * <p>
 * Project_Name：AndroidUtils2
 * Package_Name：com.itheima.androidutils
 * Version：1.0
 * time：2016/2/15 11:50
 * des ：Android工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class PhoneUtils {
	/**
	 * @param phoneNo
	 *            加星号过的电话号码
	 */
	public static String dealPhoneNo(String phoneNo) {
		return phoneNo.substring(0, 3) + "****" + phoneNo.substring(7);
	}

	/**
	 *  通过正则表达式判断是否为手机号
	 * @param phoneString
	 * @return
	 */
	public static boolean isPhoneNumber(String phoneString) {
		String format = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
		return isMatch(format, phoneString);
	}

	/**
	 *  字符串正则校验
	 * @param regex
	 *            正则表达式
	 * @param string
	 *            需要检验的字符串
	 * @return
	 */
	public static boolean isMatch(String regex, String string) {

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		return matcher.matches();
	}
}
