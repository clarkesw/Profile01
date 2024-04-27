package com.seleniumexpress.fistspringapp;

import com.seleniumexpress.fistspringapp.service.GpayPaymentGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("gpay")
public class GpayConfig {
    
    @Bean
    public GpayPaymentGateway pPaymentGateWay(){
        return new GpayPaymentGateway();
    }
}
