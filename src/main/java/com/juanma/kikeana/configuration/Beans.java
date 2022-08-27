package com.juanma.kikeana.configuration;

import com.juanma.kikeana.entity.Employee;
import com.juanma.kikeana.entity.Enterprise;
import com.juanma.kikeana.entity.Profile;
import com.juanma.kikeana.entity.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Profile profile() {
        return new Profile();
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Transaction transaction() {
        return new Transaction();
    }

    @Bean
    public Enterprise enterprise() {
        return new Enterprise();
    }

}