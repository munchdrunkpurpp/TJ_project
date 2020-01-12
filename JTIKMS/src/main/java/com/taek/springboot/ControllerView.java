package com.taek.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class ControllerView { 
	@RequestMapping("/") 
	public String welcome() { 
		return "/common/welcome";
	}
}