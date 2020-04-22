package com.practice1.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice1.bo.LoginControllerBo;
import com.practice1.model.UserData;

@Controller
public class LoginController extends HttpServlet{
 
	@RequestMapping(value="receive")
	public ModelAndView validateUser(HttpServletRequest req,HttpServletResponse res)
	{
		String userid=req.getParameter("username");
		String psw=req.getParameter("psw");
		LoginControllerBo bo=new LoginControllerBo();
		Object obj=bo.validateUser(userid,psw);
		if(obj!=null)
		{
			if(obj instanceof UserData)
			{
			 HttpSession session =req.getSession();	
			 session.setAttribute("msg",obj);
			  return new ModelAndView("welcome");
			}
			else
				return new ModelAndView("error");
		}
		else
		{
			req.setAttribute("msg","Username or password is not correct");
			return new ModelAndView("loginform");
		}
	}
	
}
