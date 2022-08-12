package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	public static void main(String[]args) {
		
		// ClassPathXmlApplicationContext BeanFactory의 하위 인터페이스로 더 자주 쓰인다
		// xml 파일을 읽어 설정 정보 로딩, root 로부터 경로 지정
		ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
		
		
		Calculator cal=(Calculator)context.getBean("proxyCal");
		cal.add(100, 20);
		System.out.println();
		cal.substract(100, 20);
		System.out.println();
		cal.multiply(100, 20);
		System.out.println();
		cal.divide(100, 20);
		System.out.println();
	}
}
