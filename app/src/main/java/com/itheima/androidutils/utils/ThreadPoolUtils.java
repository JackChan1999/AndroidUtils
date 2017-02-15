package com.itheima.androidutils.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

public class ThreadPoolUtils {
	private ExecutorService service;

	private ThreadPoolUtils() {
		int num = Runtime.getRuntime().availableProcessors();
		service = Executors.newFixedThreadPool(num * 2);
	}

	private static final ThreadPoolUtils manager = new ThreadPoolUtils();

	public static ThreadPoolUtils getInstance() {
		return manager;
	}

	public void addTask(Runnable runnable) {
		service.execute(runnable);
	}
}
