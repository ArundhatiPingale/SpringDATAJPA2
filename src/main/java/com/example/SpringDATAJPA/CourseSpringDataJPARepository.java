package com.example.SpringDATAJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer >
{

	}
