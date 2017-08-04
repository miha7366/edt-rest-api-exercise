package com.edt.exercise.rest.util;

import org.apache.commons.dbutils.QueryRunner;
import org.sqlite.SQLiteDataSource;

public class DatabaseUtils {
	
	private static QueryRunner runner;
	private static String DATABASE_PATH = "C:\\edt-rest-api-exercise\\";
	
	public static QueryRunner getQueryRunner() {
		if (runner == null) {
			SQLiteDataSource source = new SQLiteDataSource();
			source.setUrl("jdbc:sqlite:" + DATABASE_PATH + "rest-api-exercize.db");
			runner = new QueryRunner(source);
		}
		return runner;
	}

}
