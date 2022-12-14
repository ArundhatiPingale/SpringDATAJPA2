package com.example.SpringDATAJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(
				new Course ( 2, "Spring","James"));

		repository.save(
				new Course ( 3, "Jpa","chaerl"));
		repository.save(
				new Course ( 4, "Hibernate","Chico"));
		
		repository.deleteById(4);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}
	
	

}
