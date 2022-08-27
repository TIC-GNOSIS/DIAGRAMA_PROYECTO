package com.juanma.kikeana.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "image")
    private String image;

    @Column(name = "phone", length = 15)
    private String phone;

    @OneToOne
    @JoinColumn(name = "employee")
    private Employee employee;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;


}
