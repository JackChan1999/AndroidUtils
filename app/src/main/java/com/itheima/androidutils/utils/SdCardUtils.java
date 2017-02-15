package com.itheima.androidutils.utils;

import android.os.Environment;
import android.os.StatFs;

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

public class SdCardUtils {
	public static boolean hasSdcard() {
		String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 计算sdcard上的剩余空间
	 * 
	 * @return
	 */
	public int freeSpaceOnSd() {
		StatFs stat = new StatFs(Environment.getExternalStorageDirectory().getPath());
		// (availableBlocks * blockSize)/1024 KIB 单位
		// (availableBlocks * blockSize)/1024 /1024 MIB单位
		double sdFreeMB = ((double) stat.getAvailableBlocks() * (double) stat.getBlockSize()) / (1024 * 1024);
		return (int) sdFreeMB;
	}
}
