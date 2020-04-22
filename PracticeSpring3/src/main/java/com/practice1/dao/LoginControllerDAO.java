package com.practice1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.practice1.dbUtil.DBUtil;
import com.practice1.model.UserData;
import com.practice1.queryConstants.QueryConstants;

public class LoginControllerDAO {


	public Object validateUser(String userid, String psw) {
		// TODO Auto-generated method stub
		Connection con=null;
		UserData userdata=null;
		try {
			con=DBUtil.getConnection();
			if(con!=null)
			{
				PreparedStatement ps=con.prepareStatement(QueryConstants.checkUser);
				ps.setString(1,userid);
				ps.setString(2,psw);
				
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					userdata=new UserData(rs.getString(6), rs.getString(7), rs.getString(1), rs.getString(2),rs.getInt(3),"",rs.getString(4),rs.getDate(5).toLocalDate());
					return userdata;
				}
				else
				{
					return null;
				}
			}
			else
			{
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e;
		}
		finally
		{
			ps.
		}
	}

}
