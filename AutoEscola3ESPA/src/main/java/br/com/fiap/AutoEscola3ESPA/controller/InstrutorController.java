package br.com.fiap.AutoEscola3ESPA.controller;

import br.com.fiap.AutoEscola3ESPA.Instrutor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody InstrutorDTO dados) {
        instrutor instrutor = new instrutor(dados);
        repository.save(instrutor);
    }
    @GetMapping
    public Page<DadosListagemInstrutor> listarInstrutores(
            @PageableDefault(size = 2, sort = "nome") Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(DadosListagemInstrutor::new);
    }
    @GetMapping("/1")
    public instrutor detalharInstrutor(@PathVariable Long id){
        return repository.getReferenceById(id);
    }
    @PutMapping
    public void atualizarInstrutor(DadosAtualizacaoInstrutor dados){
        instrutor instrutor = repository.getReferenceById(dados.id());
        instrutor.atualizarInformacoes(dados);
        repository.save(instrutor);
    }
    @DeleteMapping("/{id}")
    public void excluirInstrutor(@PathVariable Long id){
        repository.deleteById(id);
    }
}


