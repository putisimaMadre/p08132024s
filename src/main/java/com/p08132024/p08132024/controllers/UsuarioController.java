package com.p08132024.p08132024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @GetMapping("/usuario")
    public void getUsuario(){
        System.out.println("Hola mundo");
    }
}
