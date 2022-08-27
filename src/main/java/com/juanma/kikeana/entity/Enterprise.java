package com.juanma.kikeana.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "document", nullable = false, unique = true, length = 50)
    private String document;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @OneToMany
    @JsonManagedReference
    private List<Profile> profile = new ArrayList<>();

    @OneToMany
    @JsonManagedReference
    private List<Transaction> transaction = new ArrayList<>();

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

}
