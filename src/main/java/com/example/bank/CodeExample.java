package com.example.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeExample {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
		

	}

}
