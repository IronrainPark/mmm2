package io.cheolu.mmm2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
    @RequestMapping("/")
    public String main() {
        return "main";
    }
    
    @RequestMapping("/in")
    public String in() {
    	return "mmm2";
    }
}
