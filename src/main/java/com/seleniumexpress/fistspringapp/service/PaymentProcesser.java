package com.seleniumexpress.fistspringapp.service;

public class PaymentProcesser {
	
    PaymentGateway paymentGateway;

    public PaymentProcesser(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void doPayment(int amount) {
        paymentGateway.pay(amount);
    }
}
