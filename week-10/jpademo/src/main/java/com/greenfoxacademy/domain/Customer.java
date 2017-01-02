package com.greenfoxacademy.domain;

import lombok.Getter;
import lombok.Setter;
import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name ="customers_phones")
    private Set<PhoneNumber> phoneNumbers;
}
