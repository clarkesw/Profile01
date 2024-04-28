package com.seleniumexpress.fistspringapp.service;

public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("paying through paypal..");
        System.out.println("payment processing for amount : " + amount);
    }
}
