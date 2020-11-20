package com.example.bank;

import org.hibernate.service.spi.InjectService;

public class SpellChecker {
	

	private String name;
   public SpellChecker(){
      System.out.println("Inside SpellChecker constructor." );
      System.out.println("Hi" + name );
   }
   public void checkSpelling() {
      System.out.println("Inside checkSpelling." );
   }
}