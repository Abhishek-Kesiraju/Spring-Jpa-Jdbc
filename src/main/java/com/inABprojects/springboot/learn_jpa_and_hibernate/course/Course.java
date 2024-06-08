package com.inABprojects.springboot.learn_jpa_and_hibernate.course;

public class Course {

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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
