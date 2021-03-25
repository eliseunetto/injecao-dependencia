package com.eliseunetto.id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eliseunetto.id.services.PayService;

@SpringBootApplication
public class DependencyInjectionSpringApplication implements CommandLineRunner {
	
	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSpringApplication.class, args);
	}

	private double cost = 300;
	private String state = "SC";
	
	@Override
	public void run(String... args) throws Exception {
		System.out.printf("Custo: %.2f\n", cost);
		System.out.printf("Local de entrega: %s\n", state);
		System.out.printf("Custo: %.2f\n", payService.finalPrice(cost, state));
	}

}
