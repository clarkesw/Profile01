package com.seleniumexpress.fistspringapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("gpay")
public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {

            System.out.println("paying through gpay..");
            System.out.println("payment processing for amount : " + amount);
    }

}
