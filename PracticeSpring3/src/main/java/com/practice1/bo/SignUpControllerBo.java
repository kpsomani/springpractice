package com.practice1.bo;

import com.practice1.dao.SignUpControllerDAO;
import com.practice1.model.UserData;

public class SignUpControllerBo {

	public boolean addUser(UserData userdata) throws Exception {
		// TODO Auto-generated method stub
		SignUpControllerDAO dao=new SignUpControllerDAO();
		return dao.addUser(userdata);
	}

}
