package com.eliseunetto.id.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

	/*
	 * The tax is 10%
	 */
	public double tax(double value) {
		return value * 0.1;
	}
}
