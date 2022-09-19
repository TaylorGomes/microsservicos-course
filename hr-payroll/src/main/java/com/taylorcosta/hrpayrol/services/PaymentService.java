package com.taylorcosta.hrpayrol.services;

import org.springframework.stereotype.Service;

import com.taylorcosta.hrpayrol.entities.Payment;


@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}

