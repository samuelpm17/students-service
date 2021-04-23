package com.unosquare.learning.studentsservice.service;

import java.util.List;

import com.unosquare.learning.commons.learningcommons.model.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(Long id);

	public Student save(Student student);

	public void delete(Long id);

}
