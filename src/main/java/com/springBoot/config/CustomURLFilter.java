package com.springBoot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomURLFilter 
{
	@Bean
	public FilterRegistrationBean<CustomFilter> loggingFilter()
	{
		FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new CustomFilter());
		registrationBean.addUrlPatterns("/get/*");
		
		System.out.println("in URL filter: ");
		
		return registrationBean;
		
		
	}


}
