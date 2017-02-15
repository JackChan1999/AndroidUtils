package com.itheima.androidutils.utils;

import java.text.DecimalFormat;
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
 * Project_Name：pvzhm52
 * Package_Name：com.itheima.pvzhm52
 * Version：1.0
 * time：2016/2/15 11:50
 * des ：Android工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class FloatUtils {
	/**还就是要保留2位小数点
	 * @param price
	 * @return
	 */
	public static String format(String price) {
		if ("0".equals(price)) {
			return "0.00";
		}
		Float f = (float) (Integer.parseInt(price) / 100.00);
		DecimalFormat formater = new DecimalFormat("##.00");
		return formater.format(f);
	}

	/**
	 * @param 需要验证的参数
	 * @return 是否是浮点数
	 */
	public static boolean isFloat(String string) {
		String regex = "^[-+]??(\\d++[.]\\d*?|[.]\\d+?)([eE][-+]??\\d++)?$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(string).matches();
	}

	/**
	 * 删除float没用的0
	 * @param f 11.1-->11.1  11.0-->11
	 * @return
	 */
	public static String DeleteFloatZero(Float f) {
		String mStr = f.toString();
		if (mStr.indexOf(".0") != -1) {
			int index = mStr.indexOf(".0");
			mStr = mStr.substring(0, index);
		}
		return mStr;
	}
}
