package com.practice1.bo;

import com.practice1.dao.LoginControllerDAO;
import com.practice1.model.UserData;

public class LoginControllerBo {

	public Object validateUser(String userid, String psw) {
		// TODO Auto-generated method stub
		LoginControllerDAO dao=new LoginControllerDAO();
		return dao.validateUser(userid,psw);
	}

}
