package com.aop.test.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AOPTestController{

	@Autowired
	AopService service;
	
	@GetMapping("/aop")
	public void test() {
		System.out.println("컨트롤러 도착");
		service.test();
	}
}
