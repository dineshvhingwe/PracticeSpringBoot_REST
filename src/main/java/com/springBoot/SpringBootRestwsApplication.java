package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springBoot"}) ///imp

public class SpringBootRestwsApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootRestwsApplication.class, args);
	}

}

