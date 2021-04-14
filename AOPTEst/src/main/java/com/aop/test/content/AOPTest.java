package com.aop.test.content;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class AOPTest {
	
	//@Around("execution(* com.aop.test.content.AopService.*(..))")
	@Around("execution(public void com.aop.test.content.AopService.test(..))")
	public void aroundmethod(ProceedingJoinPoint joinPoint)throws Throwable {
		
		for(int i =0 ;i < 3 ;i++) {
			System.out.println("sad"+i);
		}
		System.out.println("around 실행"+joinPoint.getSignature().getDeclaringTypeName());
		joinPoint.proceed();  // proceed 를 선언해 주지 않으면 around 호출 후 다음 로직이 실행되지 않는다.
		
	}
	
	@Before("execution(public String com.aop.test.content.AopService.before(..))")
	public void before() throws Throwable {      //ProceedingJoinPoint 파라미터는 오직 @around에만에서만 사용가능 
		System.out.println("before 실행");
	}

}
