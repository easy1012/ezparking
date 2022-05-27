package com.example.ezpark.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String age;
    @Column
    private String role;



    @Builder
    public Article(Long id, String username, String password, String email, String age, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.role = "user";
    }
}
