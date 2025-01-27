package com.ejercicio3.ej_3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ejercicio3.ej_3.Clientes;

@RestController
public class ej_3 {

    @GetMapping("/api/clientes")
    public List<Clientes> getcliente(){

        List<Clientes> clientes = new ArrayList<>();
        clientes.add(new Clientes("Arley", 18));
        clientes.add(new Clientes("Inge", 26));
        clientes.add(new Clientes("Carlos", 30));

        return clientes;
    }

}
