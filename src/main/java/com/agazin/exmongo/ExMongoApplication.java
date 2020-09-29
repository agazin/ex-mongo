package com.agazin.exmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

@SpringBootApplication
public class ExMongoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExMongoApplication.class, args);
	}

	@Autowired
	CustomerService customerService;
	
	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker();
		Customer customer = Customer.builder()
							.firstName(faker.name().firstName())
							.lastName(faker.name().lastName())
							.age(faker.number().randomDigit())
							.email(faker.bothify("????##@gmail.com"))
							.build();
		customerService.createCustomer(customer);
	}
}
