package com.eliseunetto.id.services;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {

	/*
	 * The fee is R$ 10,00 for SP and R$ 20,00 for another states
	 */
	public double fee(String state) {
		if("SP".equalsIgnoreCase(state)) {
			return 10.0;
		}
		return 20.0;
	}
}
