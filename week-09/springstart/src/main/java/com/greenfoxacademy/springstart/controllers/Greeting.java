package com.greenfoxacademy.springstart.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by false on 2016. 12. 19..
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Greeting {
    long id;
    String content;
}
