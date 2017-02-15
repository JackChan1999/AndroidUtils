package com.itheima.androidutils.utils;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
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

public class TelephonyUtils {
	/**
	 * 直接拨打电话
	 */
	public static void callPhone(Context context, String phoneNum) {
		if (phoneNum != null && phoneNum.trim().length() > 0) {
			Intent intent = new Intent(Intent.ACTION_CALL);
			Uri uri = Uri.parse("tel:" + phoneNum);
			intent.setData(uri);
			context.startActivity(intent);
		}
	}

	/**
	 * 跳转到拨号界面
	 */
	public static void CallSysDial(Context context, String phoneNum) {
		Intent intent = new Intent(Intent.ACTION_DIAL);
		Uri uri = Uri.parse("tel:" + phoneNum);
		intent.setData(uri);
		context.startActivity(intent);
	}

	/**
	 * 跳转到系统的短信编辑界面
	 */
	public static void sendMessage(Context context, String phoneNum, String content) {
		Intent intent = new Intent(Intent.ACTION_SENDTO);
		Uri uri = Uri.parse("smsto:" + phoneNum);
		intent.setData(uri);
		intent.putExtra("sms_body", content);
		context.startActivity(intent);
	}

	/**
	 * 直接发送短信，无界面
	 */
	public static void sendHideMessage(Context context, String phoneNum, String content) {
		if (phoneNum != null && phoneNum.trim().length() > 0) {
			SmsManager manager = SmsManager.getDefault();
			// 消息内容大于70就对消息进行拆分
			if (content.length() > 70) {
				ArrayList<String> arrayList = manager.divideMessage(content);
				for (String message : arrayList) {
					manager.sendTextMessage(phoneNum, null, message, null, null);
				}
			} else {
				manager.sendTextMessage(phoneNum, null, content, null, null);
			}
		}
	}

}
