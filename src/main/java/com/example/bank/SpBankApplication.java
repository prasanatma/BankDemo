package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EntityScan
@EnableTransactionManagement
@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan({ "com.example.bank.*" })
public class SpBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBankApplication.class, args);
	}
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}
	
	@GetMapping("api/hello/{user}")
	@ResponseBody
	public String testMessage(@PathVariable String user) {
		return "Hello "+ user + " welcome to first page....!!";
	}
	
	

}
