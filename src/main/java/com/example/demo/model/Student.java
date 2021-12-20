package com.example.demo.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;
    private String name;
    private String email_id;
    private LocalDate dob;

    @Transient
    private Integer age;

    public Student(long id, String name, String email_id, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email_id = email_id;
        this.dob = dob;
        this.age = age;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }
}


