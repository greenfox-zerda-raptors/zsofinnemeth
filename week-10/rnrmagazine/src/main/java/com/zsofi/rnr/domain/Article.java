package com.zsofi.rnr.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by false on 2017. 01. 10..
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String content;
    private LocalDateTime dateTime;

    public Article (String content) {
        this.content = content;
    }

//    public String getFormattedTimestamp() {
//        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//    }
}
