package com.itheima.androidutils.utils;

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
 * des ：Android 集合工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class CollectionUtils {
	/**
	 * 数组是否包含元素
	 * @param arr
	 * @param str
	 * @return
	 */
	public static boolean isArrayContains(String[] arr, String str) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			String curStr = arr[i];
			if (curStr.equals(str)) {
				return true;
			}
		}
		return false;
	}
}
