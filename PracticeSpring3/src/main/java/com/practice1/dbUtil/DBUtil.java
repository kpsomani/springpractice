package com.practice1.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		    Connection con=null; 
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springpractice","root","Chesterfan2@");
		    return con;
	}
	
	
}
