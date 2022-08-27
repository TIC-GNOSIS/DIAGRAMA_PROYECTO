package com.juanma.kikeana.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @OneToMany
    private Enum_RolName role;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    @OneToMany
    @JsonManagedReference
    private List<Transaction> transaction = new ArrayList<>();

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

}
