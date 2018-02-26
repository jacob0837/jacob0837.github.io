package com.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcUtil {
	private static DataSource dataSource;
	
	public static void setDataSource(DataSource dataSource) {
		JdbcUtil.dataSource = dataSource;
	}
	
	private static Connection conn;
	
	public static Connection getConnection(){
		if(null==conn){
			try {
				conn = dataSource.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	
}
