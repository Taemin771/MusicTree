package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping(value = "/main") //main 이라는게 있어야 index 페이지가 나온다
	 public String Main() {
		return  "index";
	}

}
