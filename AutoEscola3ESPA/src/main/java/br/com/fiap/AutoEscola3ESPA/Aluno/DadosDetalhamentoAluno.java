package br.com.fiap.AutoEscola3ESPA.Aluno;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record DadosDetalhamentoAluno(
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf,
        EnderecoDto endereco) {
    public DadosDetalhamentoAluno(aluno aluno) {
        this(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getTelefone(),
                aluno.getCpf(),
                new EnderecoDto(aluno.getEndereco())
        );
    }
}