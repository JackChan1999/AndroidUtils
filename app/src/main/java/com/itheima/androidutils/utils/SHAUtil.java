package com.itheima.androidutils.utils;

import java.security.MessageDigest;

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
 * des ：Android sha加密工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/


public class SHAUtil {

	// 进行SHA-1加密
	public static String SHAEncode(String message) {
		String resultString = null;

		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			md.update(message.getBytes());
			resultString = bytes2HexString(md.digest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}

	// 将Bytes数据转换成16进制字符串格式
	public static String bytes2HexString(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}

}
