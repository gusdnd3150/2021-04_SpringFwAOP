package com.aop.test.content;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	
	public void test() {
		System.out.println("서비스 test 실행");
	}
	
	public String before() {
		System.out.println("서비스 before 실행");
		return "before";
	}
}
