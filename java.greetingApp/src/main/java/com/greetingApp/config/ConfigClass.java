package com.greetingApp.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages={"com.greetingApp"})
public class ConfigClass 
{
	public ConfigClass()
	{
		System.out.println("Config bean is created");
	}
	@Bean
	public LocalDateTime createTimeObject()
	{
		return LocalDateTime.now();
		
	}
}
