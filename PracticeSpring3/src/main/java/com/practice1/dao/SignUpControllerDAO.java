package com.practice1.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.naming.java.javaURLContextFactory;

import com.practice1.dbUtil.DBUtil;
import com.practice1.model.UserData;
import com.practice1.queryConstants.QueryConstants;

public class SignUpControllerDAO {

	public boolean addUser(UserData userdata) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=DBUtil.getConnection();
			if(con!=null)
			{
			    ps=con.prepareStatement(QueryConstants.addUser);
				ps.setString(1,userdata.getFirstname());
				ps.setString(2,userdata.getLastname() );
				ps.setInt(3,userdata.getAge());
				ps.setString(4,userdata.getEmail());
				ps.setDate(5,Date.valueOf(userdata.getDob()));
				ps.setString(6,userdata.getUserID());
				ps.setString(7,userdata.getPsw());             
				
				int count=ps.executeUpdate();
				if(count==1)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				throw new Exception();
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		finally
		{
			
		try
		{
		  if(ps!=null)
		  {
			  ps.close();
		  }
		  if(con!=null)
		  {
			  con.close();
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		}
		
	}

}
