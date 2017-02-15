package com.itheima.androidutils.utils;

import android.content.Context;
import android.content.res.Resources;

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

public class ResourceUtils {

	public static int getDrawableId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "drawable", context.getPackageName());
	}

	public static int getLayoutId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "layout", context.getPackageName());
	}

	public static int getStringsId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "string", context.getPackageName());
	}

	public static int getColorId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "color", context.getPackageName());
	}

	public static int getIdId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "id", context.getPackageName());
	}

	public static int getRawId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "raw", context.getPackageName());
	}

	public static int getAnimId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "anim", context.getPackageName());
	}

	public static int getStyleId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "style", context.getPackageName());
	}

	public static int getStyleableId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "styleable", context.getPackageName());
	}

	public static int getAttrId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "attr", context.getPackageName());
	}

	public static int getArrayId(Context context, String name) {
		Resources res = context.getResources();
		return res.getIdentifier(name, "array", context.getPackageName());
	}
}
