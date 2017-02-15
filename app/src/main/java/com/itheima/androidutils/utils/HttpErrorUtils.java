package com.itheima.androidutils.utils;

import java.util.HashMap;
import java.util.Map;

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
 * des ：Android Http工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class HttpErrorUtils {
	public static String STR = "202:Accepted&502:Bad Gateway&405:Bad Method&400:Bad Request&408:ClientTimeout&409:Conflict&201:Created&413:Entity too large&403:Forbidden&504:Gateway timeout&410:Gone&500:Internal error&411:Length required&301:Moved permanently&302:Moved temporarily&300:Multiple choices&406:Not acceptable&203:Not authoritative&404:Not found&501:Not implemented&304:Not modified&204:No content&200:OK&206:Partial&402:Payment required&412:Precondition failed&407:Proxy authentication required&414:Request too long&205:Reset&303:See othe&401:Unauthorized&503:Unavailable&415:Unsupported type305:Use proxy&505:Version not supported";

	public static Map<String, String> getHttpCodeMap() {
		Map<String, String> httpCodeMap = new HashMap<String, String>();
		String[] str = STR.split("&");
		for (int i = 0; i < str.length; i++) {
			httpCodeMap.put(str[i].substring(0, str[i].indexOf(":")), str[i].substring(str[i].indexOf(":") + 1));
		}
		return httpCodeMap;
	}
}
