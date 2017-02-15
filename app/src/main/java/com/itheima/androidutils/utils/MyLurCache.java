package com.itheima.androidutils.utils;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

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

public class MyLurCache extends LruCache<String, Bitmap> {

	public MyLurCache(int maxSize) {
		super(4 * 1024 * 1024);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int sizeOf(String key, Bitmap value) {
		// TODO
		return value.getRowBytes() * value.getHeight() / 1024;
	}

}
