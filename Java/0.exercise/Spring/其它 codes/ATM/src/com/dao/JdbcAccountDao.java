package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.util.JdbcTemplate;
import com.vo.Account;

public class JdbcAccountDao implements IAccountDao {
	private JdbcTemplate jt = null;
	public JdbcAccountDao(DataSource dataSource){
		jt = new JdbcTemplate(dataSource);
	}

	public void deposit(long id, double amount) {
		String sql = "update account set balance = balance+? where id=?";
		Object[] args = new Object[]{amount,id};
		jt.update(sql, args);
	}

	public long open(String name, double init) {
//		Connection conn = JdbcUtil.getConnection();
//		PreparedStatement pstmt = null;
//		String sql = "insert into account(id,name,balance) values(?,?,?)";
//		long id = System.currentTimeMillis();
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setLong(1, id);
//			pstmt.setString(2, name);
//			pstmt.setDouble(3, init);
//			pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			
//		}
//		return id;
		String sql = "insert into account(id,name,balance) values(?,?,?)";
		long id = System.currentTimeMillis();
		Object[] args = new Object[]{id,name,init};
		jt.update(sql, args);
		return id;
	}

	public void transfer(long ida, long idb, double amount) {
		withdraw(ida, amount);
		deposit(idb, amount);
	}

	public void withdraw(long id, double amount) {
//		Connection conn = JdbcUtil.getConnection();
//		PreparedStatement pstmt = null;
//		String sql = "update account set balance = balance-? where id=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setDouble(1, amount);
//			pstmt.setLong(2, id);
//			pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			
//		}
		String sql = "update account set balance = balance-? where id=?";
		Object[] args = new Object[]{amount,id};
		jt.update(sql, args);
	}

	public List<Account> queryAccountsByName(String name) {
//		List<Account> result = new ArrayList<Account>();
//		Connection conn = JdbcUtil.getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select * from account where name=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			rs = pstmt.executeQuery();
//			while(rs.next()){
//				Account a = new Account();
//				a.setId(rs.getLong("id"));
//				a.setName(rs.getString("name"));
//				a.setBalance(rs.getDouble("balance"));
//				result.add(a);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			
//		}
//		return result;
		String sql = "select * from account where name=?";
		Object[] args = new Object[]{name};
		List<Map> list = jt.query(sql, args);
		List<Account> result = new ArrayList<Account>();
		for(Map m:list){
			Account a = new Account();
			a.setId((Long)m.get("id"));
			a.setName((String)m.get("name"));
			a.setBalance((Double)m.get("balance"));
			result.add(a);
		}
		return result;
	}

}
