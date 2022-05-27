package com.example.ezpark.controller;

import com.example.ezpark.dto.ArticleForm;
import com.example.ezpark.entity.Article;
import com.example.ezpark.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnrollController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/enrollpage")
    public String enrollform(){
        return "enrollpage";
    }

    @PostMapping("/enrollpage")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        Article article = form.toEntity();
        System.out.println(article.toString());
        Article saved = articleRepository.save(article);
        return "";
    }
}
