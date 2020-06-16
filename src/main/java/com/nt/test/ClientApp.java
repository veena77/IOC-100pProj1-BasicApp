package com.nt.test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMsgGenerator;
import com.nt.config.AppConfig;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator generator=null;
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		generator=ctx.getBean("wmsg",WishMsgGenerator.class);
		String msg=generator.generateWishMessage("Nani");
		System.out.println("REsults is::"+msg);
		Calendar cal=ctx.getBean("cal", Calendar.class);
		System.out.println(cal);
		((ConfigurableApplicationContext) ctx).close();
	
	}
}
