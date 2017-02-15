package com.itheima.androidutils.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.StringReader;
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
 * des ：Android Gson工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class GsonJsonUtils {
	public static Map<String, Object> parseJson2Map(String json) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		Gson gson = new GsonBuilder().create();
		JsonReader reader = new JsonReader(new StringReader(json));
		map = gson.fromJson(reader, new TypeToken<Map<String, Object>>() {
		}.getType());
		return map;
	}

	public static String parseObj2Json(Object object) throws Exception {
		if (object == null) {
			return "";
		}
		Gson g = new GsonBuilder().create();
		String json = g.toJson(object, object.getClass());
		return json;
	}

	/**
	 * JSON转成指定对象
	 * @param json
	 */
	public static <T> T parseJson2Obj(String json, TypeToken<T> typeToken) throws Exception {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(json));
		return gson.fromJson(reader, typeToken.getType());
	}
}
