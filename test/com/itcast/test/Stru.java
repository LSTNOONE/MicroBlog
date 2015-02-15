package com.itcast.test;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class Stru  extends ActionSupport{
	
	public String execute()
	{
		System.out.println("dddddddd");
		return "success";
	}
}
