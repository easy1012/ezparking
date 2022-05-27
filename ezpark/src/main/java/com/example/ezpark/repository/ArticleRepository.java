package com.example.ezpark.repository;

import com.example.ezpark.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article,Long> {
}
