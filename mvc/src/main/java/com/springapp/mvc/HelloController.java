package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.System;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        System.out.println("hello");
		return "hello";
	}

    @RequestMapping("/do")
    public String doNext(ModelMap model,String name,String age){
        model.addAttribute("message","name is :"+name+"  ;; the age is :"+age) ;
        System.out.println(name+";"+age);

        return "hello";
    }
}