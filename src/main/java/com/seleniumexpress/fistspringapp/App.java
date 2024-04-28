package com.seleniumexpress.fistspringapp;

import com.seleniumexpress.fistspringapp.service.PaymentProcesser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
        container.getEnvironment().setActiveProfiles("gpay");
        container.register(AppConfig.class);
        
        container.refresh();
        PaymentProcesser bean = container.getBean(PaymentProcesser.class);
        bean.doPayment(354);
    	
    }
}

















