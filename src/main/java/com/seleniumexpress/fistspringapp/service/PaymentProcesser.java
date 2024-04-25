package com.seleniumexpress.fistspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcesser {
	
    @Autowired
    PaymentGateway paymentGateway;

    public void doPayment(int amount) {

            paymentGateway.pay(amount);
    }

}
