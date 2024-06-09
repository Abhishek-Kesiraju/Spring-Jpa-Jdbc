package com.inABprojects.springboot.learn_jpa_and_hibernate.course.jpa;


import com.inABprojects.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CoursejpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findbyId(long id){
       return entityManager.find(Course.class, id);
    }

    public void delete(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);

    }

}
