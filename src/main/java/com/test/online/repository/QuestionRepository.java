package com.test.online.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.online.model.Questions;

public interface QuestionRepository extends CrudRepository<Questions, Long> {
	
	

}
