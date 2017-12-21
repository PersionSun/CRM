package com.crm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tool {
	
	public static Connection  getConn(){
		
		Connection conn = null;
		
		try {
			//JDBC_ODBC«≈¡¨Ω”
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL","ibm","ibm");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn,PreparedStatement psm){
		
		try {
			conn.close();
			psm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
