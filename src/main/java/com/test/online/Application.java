package com.test.online;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.online.model.Questions;
import com.test.online.repository.QuestionRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@Bean
	public CommandLineRunner start(QuestionRepository questionRepository) {
		return (args) -> {
			System.out.println("Saving question---------------------------------------------");
			Questions question = new Questions("What is Indi'a first prime minister?");
			questionRepository.save(question);
			System.out.println("Question Saved");
					
		};
	}
	
}
