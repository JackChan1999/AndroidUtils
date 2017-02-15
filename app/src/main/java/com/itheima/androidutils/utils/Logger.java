package com.itheima.androidutils.utils;

import android.util.Log;

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

public class Logger {
	// public static int LOG_LEVEL = 0; // 全局的总开关
	public static int LOWEST_LOG_LEVEL = 0;// 0隐藏 7全部显示   最低日志显示级别
	private static int SYSTEM = 1;
	private static int VERBOS = 2;
	private static int DEBUG = 3;
	private static int INFO = 4;
	private static int WARN = 5;
	private static int ERROR = 6;

	public static void i(String tag, String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= INFO) {//
			Log.i(tag, message);
		}
	}

	public static void e(String tag, String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= ERROR) {
			Log.e(tag, message);
		}
	}

	public static void d(String tag, String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= DEBUG) {
			Log.d(tag, message);
		}
	}

	public static void w(String tag, String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= WARN) {
			Log.w(tag, message);
		}
	}

	public static void v(String tag, String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= VERBOS) {
			Log.v(tag, message);
		}
	}

	public static void s(String message) {
		if(message==null){
			return;
		}
		if (LOWEST_LOG_LEVEL <= SYSTEM) {
			System.out.println(message);
		}
	}

}
