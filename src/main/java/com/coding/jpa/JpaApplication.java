package com.coding.jpa;

import com.coding.jpa.models.Author;
import com.coding.jpa.models.Customer;
import com.coding.jpa.repositories.AuthorRepository;
import com.coding.jpa.repositories.CustomerRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			CustomerRepository customerRepository
	){
		return args -> {

			var author = Author
					.builder()
					.firstName("Vivek")
					.lastName("Gupta")
					.age(23)
					.email("vivek.gupta05@gmail.com")
					.build();

			authorRepository.save(author);

			/*
			 This is used to add dummy data into database without lots of work using javaFaker
			 */
			for (int i = 0; i < 50; i++) {

				Faker faker = new Faker();
				var customer = Customer
						.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(18,65))
						.email(faker.internet().safeEmailAddress())
						.build();
				customerRepository.save(customer);
			}
		};
	}

}
