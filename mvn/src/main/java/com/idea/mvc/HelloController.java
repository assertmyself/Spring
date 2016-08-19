package com.idea.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * test!
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        System.out.print("sdsdsdsds");

		return "hello";
	}

    @RequestMapping("/hello")
    public String hello(ModelMap model,String name ,String age){
        model.addAttribute("message","hello the name is "+name + "; the age is "+age);
        return "hello";
    }
}