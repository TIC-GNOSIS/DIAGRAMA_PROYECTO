package com.juanma.kikeana.controller;

import com.juanma.kikeana.entity.Employee;
import com.juanma.kikeana.entity.Enterprise;
import com.juanma.kikeana.entity.Profile;
import com.juanma.kikeana.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    private Profile profile;
    private Employee employee;
    private Transaction transaction;
    private Enterprise enterprise;

    public Rest(Profile profile, Employee employee, Transaction transaction, Enterprise enterprise) {
        this.profile = profile;
        this.employee = employee;
        this.transaction = transaction;
        this.enterprise = enterprise;
    }

    @GetMapping("/enterprise")
    public String generarEnterprise(){
        enterprise.setAddress("Calle falsa numero 123");
        return enterprise.getAddress();
    }

    @GetMapping("/")
    public String saludar(){
        return "Mamá, estoy triunfando, hice mi primera página web con Spring Boot";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Hola! Me llamo Juan Manuel Suárez :)";
    }

}