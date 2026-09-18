package br.com.fiap.AutoEscola3ESPA.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @PostMapping
    public void cadastrarInstrutor(@RequestBody String corpo){
        System.out.println(corpo);
    }
}
