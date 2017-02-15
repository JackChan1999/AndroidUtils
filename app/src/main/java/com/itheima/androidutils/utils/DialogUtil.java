package com.itheima.androidutils.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

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
 * des ：Android dialog工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class DialogUtil {
	/**
	 * @param context
	 * @param title
	 * @param icon
	 * @param msg
	 * @param positiveListener
	 * @param negativeListener
	 */
	public static void showDialog(Context context, String msg, String btn1Text, DialogInterface.OnClickListener positiveListener) {
		/*CustomDialogBuilder tDialog = new CustomDialogBuilder(context);
		tDialog.setMessage(msg);
		tDialog.setPositiveButton(btn1Text, positiveListener);
		tDialog.setNegativeButton("取消", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		tDialog.show();*/
	}

	public static void showDialog(Context context, String msg, String btn1Text, DialogInterface.OnClickListener positiveListener, String btn2Text,
			DialogInterface.OnClickListener negativeListener, boolean cancelAble) {
		/*CustomDialogBuilder tDialog = new CustomDialogBuilder(context);
		tDialog.setMessage(msg);
		tDialog.setPositiveButton(btn1Text, positiveListener);
		tDialog.setNegativeButton(btn2Text, negativeListener);
		tDialog.setCancelable(cancelAble);
		tDialog.show();*/
	}

	/**
	 * 确定框
	 * 
	 * @param context
	 * @param strTitle
	 * @param msg
	 */
	public static void showPositiveDialog(Activity context, String msg, String btnText) {
		/*		CustomDialogBuilder tDialog = new CustomDialogBuilder(context);
		tDialog.setMessage(msg);
		tDialog.setPositiveButton(btnText, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		tDialog.show();*/
	}

	public static void showPositiveDialog(Activity context, String msg, String btnText, DialogInterface.OnClickListener positiveListener) {
		/*CustomDialogBuilder tDialog = new CustomDialogBuilder(context);
		tDialog.setMessage(msg);
		tDialog.setPositiveButton(btnText, positiveListener);
		tDialog.show();*/
	}

	public static void showToast(Context paramContext, String paramString) {
		/*Toast localToast = Toast.makeText(paramContext, paramString, 0);
		localToast.setGravity(17, 0, 0);
		localToast.show();*/
	}

	public static void showToastView(Context context, int imgResourceId, String msg, int duration) {
		/*Toast toast = new Toast(context);
		View inflate = View.inflate(context, R.layout.inflate_toast, null);
		ImageView toast_icon = (ImageView) inflate.findViewById(R.id.toast_icon);
		TextView toast_msg = (TextView) inflate.findViewById(R.id.toast_msg);
		if (imgResourceId == 0) {
			toast_icon.setVisibility(View.GONE);
		} else {
			toast_icon.setImageResource(imgResourceId);
		}
		toast_msg.setText(msg);
		toast.setView(inflate);
		toast.setDuration(duration);
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.show();*/
	}
}
