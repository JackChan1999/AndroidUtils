package com.itheima.androidutils.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

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

public class BrowserUtils {
	/**
	 * 访问网站
	 */
	public static void onInternet(Context mContext, String info) {
		/* 调用系统浏览器 */
		Intent intent = new Intent();
		intent.setAction("android.intent.action.VIEW");
		Uri content_url = Uri.parse(info);
		intent.setData(content_url);
		mContext.startActivity(intent);
	}
}
