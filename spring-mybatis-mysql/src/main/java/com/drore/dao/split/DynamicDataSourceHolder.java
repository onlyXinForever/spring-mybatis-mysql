package com.drore.dao.split;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicDataSourceHolder {
	private static final Logger LOGGER = LoggerFactory.getLogger(DynamicDataSourceHolder.class);
	private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	public static final String DB_MASTER = "master";
	public static final String DB_SLAVE = "slave";

	public static String getDbType(){
		String db = contextHolder.get();
		if(db == null){
			db = DB_MASTER;
		}
		return db;
	}

	public static void setDbType(String dbType){
		LOGGER.debug("所使用的数据源为:" + dbType);
		contextHolder.set(dbType);
	}


	public static void clearDbType(String dbType){
		contextHolder.remove();
	}
}
