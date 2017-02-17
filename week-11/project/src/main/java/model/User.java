package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by aze on 2017.01.12..
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {
    String firstName;
    String lastName;

}
