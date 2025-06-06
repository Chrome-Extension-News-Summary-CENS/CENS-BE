package com.handong.cens.article.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long articleId;

    private String category;

    private String title;

    @Lob
    private String content;

    private String createDate;

    private String originalUrl;

    @Lob
    @Setter
    private String summary;
}
