package com.practice1.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice1.bo.LoginControllerBo;
import com.practice1.bo.SignUpControllerBo;
import com.practice1.model.UserData;
@Controller
public class SignUpController {
	@RequestMapping(value="signup")
	public ModelAndView addUser(HttpServletRequest req,HttpServletResponse res) throws Exception
	{
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String userid=req.getParameter("userid");
		String emailid=req.getParameter("email");
		String psw=req.getParameter("psw2");
		String age=req.getParameter("age");
		String bdate=req.getParameter("birthday");
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		UserData userdata=new UserData(userid, psw, firstname, lastname,Integer.parseInt(age),"",emailid,LocalDate.parse(bdate,dtf));
		SignUpControllerBo bo=new SignUpControllerBo();
		if(bo.addUser(userdata))
		{
			return new ModelAndView("loginform");
		}
		else
		{
			return new ModelAndView("signupform");
		}
	}
	}

