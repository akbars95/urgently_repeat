package com.mtsmda.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView login(@RequestParam(value = "error", required = false)String error){
		ModelAndView modelAndView = new ModelAndView();

		if(error != null){
			modelAndView.addObject("error", "Invalid username or password");
		}
		modelAndView.setViewName("login");
		return modelAndView;
	}
}