package br.com.fiap.AutoEscola3ESPA.Aluno;


import br.com.fiap.AutoEscola3ESPA.Aluno.aluno;

public record DadosListagemAluno(
        Long id,
        String nome,
        String email,
        String cpf) {
    public DadosListagemAluno(aluno aluno) {
        this(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getCpf()
        );
    }
}