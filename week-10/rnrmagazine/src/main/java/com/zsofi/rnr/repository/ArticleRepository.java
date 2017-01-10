package com.zsofi.rnr.repository;

import com.zsofi.rnr.domain.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by false on 2017. 01. 10..
 */

public interface ArticleRepository extends CrudRepository <Article, Long> {

    List<Article> findAll();
}
