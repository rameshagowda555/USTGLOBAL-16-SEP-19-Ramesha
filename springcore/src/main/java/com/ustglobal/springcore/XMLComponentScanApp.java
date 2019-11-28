package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Human;
import com.ustglobal.springcore.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
//Inside All three class i am specify the @Component("name")--->it make class as a bean		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I Love Java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Siri");
		System.out.println(pet.getName());
		
		Cat cat = context.getBean(Cat.class);
		cat.makeSound();
		
	}
}
