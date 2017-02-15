package com.itheima.androidutils.utils;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.os.Vibrator;

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
 * des ：震动工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class ShockUtil {

	/**
	 * 时长震动
	 * @param activity
	 * @param milliseconds 震动的时长，单位是毫秒
	 */
	public static void Vibrate(final Context context, long milliseconds, boolean isVibrate) {
		if (isVibrate) {
			Vibrator vib = (Vibrator) context.getSystemService(Service.VIBRATOR_SERVICE);
			vib.vibrate(milliseconds);
		}
	}

	public static void Vibrate1(final Context context, long milliseconds, boolean soundOnorOff) {
		if (soundOnorOff) {
			Vibrator vib = (Vibrator) context.getSystemService(Service.VIBRATOR_SERVICE);
			vib.vibrate(milliseconds);
		}
	}

	/**
	 * 自定义震动模式
	 * 
	 * @param activity
	 * @param pattern 数组中数字的含义依次是静止的时长，震动时长，静止时长，震动时长。 单位是毫秒
	 * @param isRepeat 是否反复震动，如果是true，反复震动，如果是false，只震动一次
	 */
	public static void Vibrate(final Activity activity, long[] pattern, boolean isRepeat) {
		Vibrator vib = (Vibrator) activity.getSystemService(Service.VIBRATOR_SERVICE);
		vib.vibrate(pattern, isRepeat ? 1 : -1);
	}
}
