package com.practice1.queryConstants;

public class QueryConstants {

	
	public final static String checkUser="select * from cust_details where id=? and psw=?";
	public final static String addUser="insert into cust_details values(?,?,?,?,?,?,?)";
}
