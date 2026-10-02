package br.com.fiap.AutoEscola3ESPA.Instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record DadosDetalhamentoInstrutor(
        Long id,
        String nome,
        String email,
        String telefone,
        String cnh,
        String especialidade,
        EnderecoDto endereco) {
    public DadosDetalhamentoInstrutor(instrutor instrutor) {
        this(
                instrutor.getId(),
                instrutor.getNome(),
                instrutor.getEmail(),
                instrutor.getTelefone(),
                instrutor.getCnh(),
                instrutor.getEspecialidade(),
                new EnderecoDto(instrutor.getEndereco())
        );
    }
}