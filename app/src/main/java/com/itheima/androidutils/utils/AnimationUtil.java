package com.itheima.androidutils.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;

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
 * des ：Android 动画工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class AnimationUtil {
	public static void showAlphaAnimation(View v, long durationMillis) {
		AlphaAnimation animation = new AlphaAnimation(0, 1);
		animation.setDuration(durationMillis);
		v.startAnimation(animation);
	}

	public static void hideAlphaAnimation(View v, long durationMillis) {
		AlphaAnimation animation = new AlphaAnimation(1, 0);
		animation.setDuration(durationMillis);
		v.startAnimation(animation);
	}
}
