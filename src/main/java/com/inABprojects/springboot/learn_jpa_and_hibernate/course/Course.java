package com.inABprojects.springboot.learn_jpa_and_hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String name;
    private String Author;

    public Course(){

    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        Author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
