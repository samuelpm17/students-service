package com.unosquare.learning.studentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.unosquare.learning.commons.learningcommons.model.entity"})
@SpringBootApplication
public class StudentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsServiceApplication.class, args);
	}

}
