package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

public class JdbcTemplate {
	public JdbcTemplate(DataSource dataSource){
		JdbcUtil.setDataSource(dataSource);
	}
	
	public void update(String sql,Object[] args){
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pstmt.setObject(i+1, args[i]);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Map> query(String sql,Object[] args){
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//Map:存放每列的名称和值 key-名字 value-值
		List<Map> list = new ArrayList<Map>();
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pstmt.setObject(i+1, args[i]);
			}
			rs = pstmt.executeQuery();
			//拿到结果集的元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			int len = rsmd.getColumnCount();
			while(rs.next()){
				Map<String,Object> map = new HashMap<String,Object>();
				for(int i =0;i<len;i++){
					String colName = rsmd.getColumnName(i+1);
					map.put(colName, rs.getObject(colName));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
