package com.handong.cens.article.repository;

import com.handong.cens.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByCategory(String descriptionByCode);
}
