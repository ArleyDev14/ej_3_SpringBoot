package com.ejercicio3.ej_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ejercicio3.ej_3.Clientes;

@RestController
public class ej_3 {

    @GetMapping("/api/clientes")
    public Clientes getcliente(){
        return new Clientes("Arley", 18);
    }

}
