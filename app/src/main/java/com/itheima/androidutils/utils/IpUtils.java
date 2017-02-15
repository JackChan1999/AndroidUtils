package com.itheima.androidutils.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

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

public class IpUtils {
	/**根据域名得到ip
	 * @param url
	 * @return
	 */
	public static String getServerIP(String url) {
		try {
			InetAddress myIPaddress = InetAddress.getByName(url);
			String hostAddress = myIPaddress.getHostAddress();
			return hostAddress;
		} catch (UnknownHostException e) {
		}
		return null;
	}
}
