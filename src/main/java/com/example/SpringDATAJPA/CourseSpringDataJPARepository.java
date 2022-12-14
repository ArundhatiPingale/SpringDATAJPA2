package com.example.SpringDATAJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.example.SpringDATAJPA.Course;


public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer >
{
  List<Course>  findByAuthor(String author);
  List<Course>  findByName(String name);
	}
