package br.com.fiap.AutoEscola3ESPA.controller;

import br.com.fiap.AutoEscola3ESPA.Instrutor.InstrutorDTO;
import br.com.fiap.AutoEscola3ESPA.Instrutor.InstrutorRepository;
import br.com.fiap.AutoEscola3ESPA.Instrutor.instrutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody InstrutorDTO corpo) {
        instrutor instrutor = new instrutor(corpo);
        repository.save(instrutor);
    }
}


