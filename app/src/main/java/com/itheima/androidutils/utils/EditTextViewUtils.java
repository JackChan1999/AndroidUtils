package com.itheima.androidutils.utils;

import android.widget.EditText;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

public class EditTextViewUtils {
	/**
	 * 自定义键盘显示关标
	 * @param editText
	 */
	public static void showOffLabel(EditText editText) {
		Class<EditText> cls = EditText.class;
		try {
			Method setShowSoftInputOnFocus = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
			setShowSoftInputOnFocus.setAccessible(false);
			setShowSoftInputOnFocus.invoke(editText, false);
			setShowSoftInputOnFocus.invoke(editText, false);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
