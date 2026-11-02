package br.com.fiap.AutoEscola3ESPA.controller;

import br.com.fiap.AutoEscola3ESPA.Aluno.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @PostMapping
    public void cadastrarAluno(@RequestBody AlunoDTO dados) {
        aluno aluno = new aluno(dados);
        repository.save(aluno);
    }
    @GetMapping
    public Page<DadosListagemAluno> listarAlunos(
            @PageableDefault(size = 2, sort = "nome") Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(DadosListagemAluno::new);
    }
    @GetMapping("/{id}")
    public aluno detalharAluno(@PathVariable Long id){
        return repository.getReferenceById(id);
    }
    @PutMapping
    public void atualizarAluno(@RequestBody DadosAtualizacaoAluno dados) {
        aluno aluno = repository.getReferenceById(dados.id());
        aluno.atualizarInformacoes(dados);
        repository.save(aluno);
    }
    @DeleteMapping("/{id}")
    public void excluirAluno(@PathVariable Long id){
        repository.deleteById(id);
    }
}


