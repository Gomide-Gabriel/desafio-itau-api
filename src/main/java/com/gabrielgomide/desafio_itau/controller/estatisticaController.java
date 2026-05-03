package com.gabrielgomide.desafio_itau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estatisticaController {

    @GetMapping("/status")
    public String statusTeste(){
        return "estatistics";
    }
}
