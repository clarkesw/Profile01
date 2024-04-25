package com.seleniumexpress.fistspringapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("paypal")
public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {

            System.out.println("paying through paypal..");
            System.out.println("payment processing for amount : " + amount);
    }

}
