package com.itheima.androidutils.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.Map;

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

public class SPUtil {
	private Context context;
	private SharedPreferences sp;
	private Editor editor;

	public SPUtil(Context context) {
		this.context = context;
		sp = this.context.getSharedPreferences("common", Context.MODE_APPEND);
		editor = sp.edit();
	}

	public void getInstance(Context context, String filename) {
		this.context = context;
		sp = context.getSharedPreferences(filename, Context.MODE_APPEND);
		editor = sp.edit();
	}

	public void putBoolean(String key, Boolean value) {
		editor.putBoolean(key, value);
		editor.commit();
	}

	public boolean getBoolean(String key, Boolean defValue) {
		return sp.getBoolean(key, defValue);
	}

	public void putString(String key, String value) {
		if (key == null) {
			return;
		}
		editor.putString(key, value);
		editor.commit();
	}

	public String getString(String key, String defValue) {
		return sp.getString(key, defValue);
	}

	public void putInt(String key, int value) {
		editor.putInt(key, value);
		editor.commit();
	}

	public int getInt(String key, int defValue) {
		return sp.getInt(key, defValue);
	}

	public Map<String, ?> getAll() {
		return sp.getAll();
	}
}
