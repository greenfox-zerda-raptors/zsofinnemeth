package com.zsofi.rnr.controllers;

import com.zsofi.rnr.repository.ArticleRepository;
import com.zsofi.rnr.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by false on 2017. 01. 10..
 */
@Controller
@RequestMapping("/")
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String listPosts(Model model) {
        model.addAttribute("articles", repository.findAll());
        return "articles/list";
    }
}
