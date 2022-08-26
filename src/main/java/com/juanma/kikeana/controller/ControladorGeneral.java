package com.juanma.kikeana.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGeneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> saludar(){
        return new ResponseEntity<>(":O Mamá, estoy triunfando, hice mi primera página web con Spring Boot", HttpStatus.OK);
    }

}