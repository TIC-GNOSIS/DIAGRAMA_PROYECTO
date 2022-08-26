package com.juanma.kikeana.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enterprise {

    @Id
    private long id;

    @OneToMany
    private Employee employee;

}
