package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HolaMundoController {

    @GetMapping("hola")
    public String holaMundo() {
        return "Hola Mundo";
    }
    
}
