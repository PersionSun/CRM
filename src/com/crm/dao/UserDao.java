package com.crm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crm.bean.User;

public class UserDao {
	public User checkLogin(String name, String pwd){
		User u =null;
		Connection conn =Tool.getConn();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			psmt = conn.prepareStatement("select * from shop_user where name=? and pwd=?");
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			
			rs = psmt.executeQuery();
			
			if(rs.next()){
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPwd(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			Tool.close(conn, psmt);
		}
		
		return u;
	}
}
