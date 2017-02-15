package com.itheima.androidutils.utils;

import android.app.Activity;
import android.content.Intent;

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
 * des ：Android email工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class EMailUtils {
	/**
	 * 调用手机中email应用发送邮件
	 * @param context
	 * @param receivers
	 * @param copys
	 * @param title
	 * @param content
	 */
	public static void sendEmail(Activity context, String[] receivers, String[] copys, String title, String content) {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("plain/text");
		//接收者
		intent.putExtra(Intent.EXTRA_EMAIL, receivers);
		//抄送者
		intent.putExtra(Intent.EXTRA_CC, copys);
		//邮件Title
		intent.putExtra(Intent.EXTRA_SUBJECT, title);
		//邮件内容
		intent.putExtra(Intent.EXTRA_TEXT, content);
		context.startActivity(Intent.createChooser(intent, null));
	}

}
