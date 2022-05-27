package com.example.ezpark.dto;

import com.example.ezpark.entity.Article;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
public class ArticleForm {
    private Long id;
    private String username;
    private String password;
    private String email;

    private String age;

    private String role;

    @Builder
    public ArticleForm(Long id, String username, String password, String email, String age, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.role = role;
    }

    public Article toEntity(){
        return Article.builder()
                .id(id)
                .username(username)
                .password(password)
                .email(email)
                .age(age)
                .role(role)
                .build();
    }
}
