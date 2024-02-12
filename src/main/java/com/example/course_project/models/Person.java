package com.example.course_project.models;

import com.example.course_project.annotations.ContactNumberConstraint;
import jakarta.persistence.*;

/**
 * @author Neil Alishev
 */
@Entity
public class Person {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String email;
    @ContactNumberConstraint
    private String phonesNumber;

    public String getPhonesNumber() {
        return phonesNumber;
    }

    public void setPhonesNumber(String phonesNumber) {
        this.phonesNumber = phonesNumber;
    }

    public Person(int id, String name, int age, String email, String phonesNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phonesNumber = phonesNumber;
    }
    public Person() {

    }
    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
