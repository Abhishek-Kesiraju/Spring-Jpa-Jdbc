package com.inABprojects.springboot.learn_jpa_and_hibernate.course;

import com.inABprojects.springboot.learn_jpa_and_hibernate.course.jpa.CoursejpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

   // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CoursejpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.insert(new Course(1, "Learn Azure Jpa!","in28minutes"));
        repository.insert(new Course(2, "Learn Angular","in28minutes"));
        repository.insert(new Course(3, "Learn React","in28minutes"));

        repository.delete(1);

        System.out.println(repository.findbyId(2));
        System.out.println(repository.findbyId(3));


    }
}
