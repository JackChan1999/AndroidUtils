package com.itheima.androidutils.utils;

import android.text.Html;
import android.text.Spannable;
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

public class TextViewUtils {
	public static Spannable changeColor(String beforeText, String centerText, String endText, String color) {
		return (Spannable) Html.fromHtml(beforeText + "<font color=\"#" + color + "\">" + centerText + "</font>" + endText);
	}

	public static Spannable changeColor(String centerText, String endText, String color) {
		return (Spannable) Html.fromHtml("<font color=\"#" + color + "\">" + centerText + "</font>" + endText);
	}

	public static Spannable changeColor(String centerText, String color) {
		return (Spannable) Html.fromHtml("<font color=\"#" + color + "\">" + centerText + "</font>");
	}
}
