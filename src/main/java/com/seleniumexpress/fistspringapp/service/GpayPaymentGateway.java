package com.seleniumexpress.fistspringapp.service;

public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("paying through gpay..");
        System.out.println("payment processing for amount : " + amount);
    }
}
