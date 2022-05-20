package com.brainmentors.chatapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
//		Step 1 - Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Step 2 - Build Connection
//		final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/chat_db";
		final String CONNECTION_STRING = "jdbc:mysql://localhost:3307/chat_db";
		String UserId = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(CONNECTION_STRING, UserId, password);
		if(con != null) {
			System.out.println("Connection Created...");
			con.close();
		}
		return null;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CommonDAO obj = new CommonDAO();
		obj.createConnection();
	}

}
