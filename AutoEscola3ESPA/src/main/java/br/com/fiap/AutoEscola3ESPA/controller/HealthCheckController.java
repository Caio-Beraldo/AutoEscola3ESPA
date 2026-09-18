package br.com.fiap.AutoEscola3ESPA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")

public class HealthCheckController {
    @GetMapping
    public String healthcheck(){
        return "Teste de integridadde da AutoEscola3ESPA";
    }
}
