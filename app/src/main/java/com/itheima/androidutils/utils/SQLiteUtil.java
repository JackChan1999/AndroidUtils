package com.itheima.androidutils.utils;

import android.database.sqlite.SQLiteDatabase;

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

public class SQLiteUtil {
	
	/**
	 * 连接数据库/没有时创建
	 * @return
	 */
	public static SQLiteDatabase getSQLiteDB(String dburl){
		SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dburl, null);
		
		return db;
	}
	
	/**
	 * 关闭数据库连接
	 * @param db
	 */
	public static void closeSQLiteDB(SQLiteDatabase db){
		if(db != null && db.isOpen()){
			db.close();
		}
	}
	
}
