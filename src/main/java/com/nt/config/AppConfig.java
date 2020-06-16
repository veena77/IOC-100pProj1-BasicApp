package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.beans")
public class AppConfig {
	static {
		System.out.println("AppConfig-static block");
	}
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
			}
@Bean("cal")
	public Calendar createCal() {
		System.out.println("AppConfig.createCal()");
		Calendar cal=Calendar.getInstance();
		
		return cal;	
	}
}
