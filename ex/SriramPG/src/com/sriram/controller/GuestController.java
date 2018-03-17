package com.sriram.controller;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sriram.model.Guest;
import com.sriram.model.Login;
import com.sriram.service.LoginService;

@Controller
public class GuestController {
	
	/*
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public ModelAndView reDirectLogin()
	{
		return new ModelAndView("login");
		
	}*/

	@Autowired
	private LoginService logSer;
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());
	    return mav;
	  }
	
	@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("login")Login login,BindingResult result){
		ModelAndView mav=null;
		System.out.println("***********="+login);
		Guest gst=logSer.validateLogin(login);
		
		 if (null != gst) {
			    mav = new ModelAndView("welcome");
			    mav.addObject("firstname", gst.getFirstname());
			    } else {
			    mav = new ModelAndView("login");
			    mav.addObject("message", "Username or Password is wrong!!");
			    }
		 
		return mav;
		
	}

}
