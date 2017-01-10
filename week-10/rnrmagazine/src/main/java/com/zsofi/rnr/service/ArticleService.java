package com.zsofi.rnr.service;

import com.zsofi.rnr.domain.Article;
import com.zsofi.rnr.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by false on 2017. 01. 10..
 */

@Component
public class ArticleService {

    @Autowired
    protected ArticleRepository repository;

    private ArticleService() {

    }
    public List<Article> articleList() {
        return repository.findAll();
    }

    public Article findOne(long id) {
        return repository.findOne(id);

    }



}
