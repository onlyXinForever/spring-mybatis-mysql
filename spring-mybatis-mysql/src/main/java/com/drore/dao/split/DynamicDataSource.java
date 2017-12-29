package com.drore.dao.split;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 获取动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDbType();
	}
}
