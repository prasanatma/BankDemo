package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBankApplication.class, args);
	}
	
	@GetMapping("api/hello/{user}")
	@ResponseBody
	public String testMessage(@PathVariable String user) {
		return "Hello "+ user + " welcome to first page....!!";
	}

}
