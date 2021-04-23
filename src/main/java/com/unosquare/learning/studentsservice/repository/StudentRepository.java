package com.unosquare.learning.studentsservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unosquare.learning.commons.learningcommons.model.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
