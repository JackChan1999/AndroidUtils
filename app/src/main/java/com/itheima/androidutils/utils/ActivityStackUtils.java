package com.itheima.androidutils.utils;

import android.app.Activity;

import java.util.Stack;

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

public class ActivityStackUtils {
	private static Stack<Activity> activityStack;
	private static ActivityStackUtils instance;

	private ActivityStackUtils() {
	}

	public static ActivityStackUtils getScreenManager() {
		if (instance == null) {
			instance = new ActivityStackUtils();
		}
		return instance;
	}

	public void popActivity() {
		Activity activity = activityStack.lastElement();
		if (activity != null) {
			activity.finish();
			activity = null;
		}
	}

	public void popActivity(Activity activity) {
		if (activity != null) {
			activity.finish();
			activityStack.remove(activity);
			activity = null;
		}
	}

	public Activity currentActivity() {
		if (!activityStack.empty()) {
			Activity activity = activityStack.lastElement();
			return activity;
		} else {
			return null;
		}
	}

	public void pushActivity(Activity activity) {
		if (activityStack == null) {
			activityStack = new Stack<Activity>();
		}
		activityStack.add(activity);
	}

	public void popAllActivityExceptOne(Class cls) {
		while (true) {
			Activity activity = currentActivity();
			if (activity == null) {
				break;
			}
			if (activity.getClass().equals(cls)) {
				break;
			}
			popActivity(activity);
		}
	}
}