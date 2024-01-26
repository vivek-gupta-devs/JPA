package com.coding.jpa;

import com.coding.jpa.models.Author;
import com.coding.jpa.repositories.AuthorRepository;
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
			AuthorRepository authorRepository
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
		};
	}

}
