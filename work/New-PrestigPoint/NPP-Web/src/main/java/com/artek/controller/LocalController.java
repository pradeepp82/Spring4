package com.artek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocalController {
	@RequestMapping("/LocalFile")
public String getLocal(ModelMap map)
{
		
return "local";	
}
}
