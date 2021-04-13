package com.aop.test.content;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPTest {
	
	@Before("execution(* * com.aop.test.content.AopService.*(..))")
	public void beforemethod()throws Throwable {
		System.out.println("before 실행");
	}

}
