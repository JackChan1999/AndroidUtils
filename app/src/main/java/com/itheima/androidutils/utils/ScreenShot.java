package com.itheima.androidutils.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
 * des ：Android 截图工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class ScreenShot {
	private static final String TAG = ScreenShot.class.getSimpleName();

	// 获取指定Activity的截屏，保存到png文件   
	private static Bitmap takeScreenShot(Activity activity) {
		//View是你需要截图的View   
		View view = activity.getWindow().getDecorView();
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();

		//获取状态栏高度   
		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;
		//      int statusBarHeight = frame.height() - view.getHeight();

		//获取屏幕长和高   
		int width = activity.getWindowManager().getDefaultDisplay().getWidth();
		int height = activity.getWindowManager().getDefaultDisplay().getHeight();

		Logger.d(TAG, "Rect height:" + frame.height() + " Rect width:	" + frame.width());
		Logger.d(TAG, "view height:" + view.getHeight() + " view width:	" + view.getWidth());
		Logger.d(TAG, "screen_shot:" + (width - 40) + " " + statusBarHeight + " " + 40 + " " + (height - statusBarHeight));

		//去掉标题栏   
		//Bitmap b = Bitmap.createBitmap(b1, 0, 25, 320, 455);   
		//        Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight); //全屏
		Bitmap b = Bitmap.createBitmap(b1, width - 40, statusBarHeight * 2, 40, height - statusBarHeight * 2); //全屏
		view.destroyDrawingCache();
		return b;
	}

	//保存到sdcard   
	private static void savePic(Bitmap b, String strFileName) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(strFileName);
			if (null != fos) {
				b.compress(Bitmap.CompressFormat.PNG, 90, fos);
				fos.flush();
				fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//程序入口   
	public static String shoot(Activity a) {
		ScreenShot.savePic(ScreenShot.takeScreenShot(a), "sdcard/maizuo_xx.png");
		return "/maizuo_xx.png";
	}

}
