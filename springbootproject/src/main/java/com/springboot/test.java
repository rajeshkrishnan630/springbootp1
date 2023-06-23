package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
 
public class test
{
	@RequestMapping("/home")
	public String testing()
	{
		
		return "home";
	}

}
