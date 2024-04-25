package com.seleniumexpress.fistspringapp;

import com.seleniumexpress.fistspringapp.service.PaymentProcesser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext container = new AnnotationConfigApplicationContext();
        container.getBean(PaymentProcesser.class).doPayment(35);
    	
    }
}

















