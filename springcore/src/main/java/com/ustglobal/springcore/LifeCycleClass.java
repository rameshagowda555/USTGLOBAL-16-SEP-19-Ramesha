package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;

public class LifeCycleClass {//refer Hello
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//close() present in ClassPathXmlApplicationContext class is not present in ApplicationContext
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		context.close();
	}
}
