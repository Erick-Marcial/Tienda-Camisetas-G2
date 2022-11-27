/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author INFINITY
 */
@RestController
public class HolaController {
    @GetMapping("/")
    public String Hola(){
        return "Hola Mundo nivelación Ciclo 3 !!!";
    }
}
