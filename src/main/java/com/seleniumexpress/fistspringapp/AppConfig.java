package com.seleniumexpress.fistspringapp;

import com.seleniumexpress.fistspringapp.service.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AppConfig {
    
    @Bean
    @Profile("gpay")
    public GpayPaymentGateway pPaymentGateWay(){
        return new GpayPaymentGateway();
    }
    
    @Bean
    @Profile("paypal")
    public PaypalPaymentGateway gPaymentGateWay(){
        return new PaypalPaymentGateway();
    }
    
    @Bean
    public PaymentProcesser paymentGateWay(PaymentGateway paymentGateway){
        return new PaymentProcesser(paymentGateway);
    }
}
