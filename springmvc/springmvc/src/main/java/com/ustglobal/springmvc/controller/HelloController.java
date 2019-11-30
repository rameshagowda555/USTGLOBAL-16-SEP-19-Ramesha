package com.ustglobal.springmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
				
	}
	
	@RequestMapping(path = "/hello")
	public String hello(@RequestParam("name")String name,//QueryString
						@RequestParam("id") int id,
						ModelMap map) {//Spring provide inbuilt ModelMap Class
		map.addAttribute("msg","Hello World");
		map.addAttribute("name",name);//QueryString parameter
		map.addAttribute("id",id);//QueryString parameter
		return "index";
	}
	
	@RequestMapping(path = "/hi1")
	public String hi(ModelMap map) {
		map.addAttribute("msg","Hello Java World");
		return "index";
	}
//	ModelMAp and HttpServletRequest both are exactly same.Modelmap is prefer to use
	@RequestMapping(path = "/hi/{name}/{id}")
	public String hi(@PathVariable("name")String name,
					 @PathVariable("id")int id,
					 HttpServletRequest request) {
		request.setAttribute("msg","Hello Java World");
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		return "index";
	}
	
	@RequestMapping(path="/form")//this controller for requesting a form page
	public String formPage() {
		return "form";
	}
	
	@RequestMapping(path ="/form",method = RequestMethod.POST )//Accepting the form and its for reading form contetnt
	public String form(Employee employee,ModelMap map) {
		map.addAttribute("id",employee.getId());
		map.addAttribute("name",employee.getName());
		map.addAttribute("password",employee.getPassword());
		map.addAttribute("gender",employee.getGender());
		map.addAttribute("doj",employee.getDoj());
		
		return "formoutput";
	}
	
	@RequestMapping(path="/create-cookie")//create a cookie and add it into response
	public String createCookie(ModelMap map,
								HttpServletResponse response) {
		Cookie cookie  = new Cookie("name", "Ramesha");
		response.addCookie(cookie);
		return "createcookie";
	}
	@RequestMapping(path="read-cookie")//for reading a cookie value
	public String readCookie(ModelMap map,
				@CookieValue(name="name",required = false)String name ) {
		map.addAttribute("name",name);
		return "readcookie";
	}
	
	@RequestMapping(path = "/redirect")// for redirect
	public String redirect() {
		return "redirect: https://www.google.com";
	}
	@RequestMapping(path = "/forward")
	public String forward() {
		return "forward:hi/Ramesha/555";
		//return "forward:hello?name=Ramesha&id=23";
	}
	
}
