package com.itheima.androidutils.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
public class IoUtils {
	/**
	 * @param is
	 * @return inputStream到String
	 * @throws IOException
	 */
	public static String convertStreamToString(InputStream is) throws IOException {
		try {
			if (is != null) {
				StringBuilder sb = new StringBuilder();
				String line;
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gbk"));
					// BufferedReader reader = new BufferedReader(new InputStreamReader(is));
					while ((line = reader.readLine()) != null) {
						// sb.append(line);
						sb.append(line).append("\n");
					}
				} finally {
					is.close();
				}
				return sb.toString();
			} else {
				return "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}
}
