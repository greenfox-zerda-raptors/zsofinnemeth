package com.greenfoxacademy.thymeleaf.controllers;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by false on 2016. 12. 20..
 */
@Getter
public class Todo {
    int id;
    String title;
    Boolean isUrgent;
    Boolean isDone;

    public Todo(int id, String title, boolean isUrgent, boolean isDone) {
    }

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
}
