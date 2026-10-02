package br.com.fiap.AutoEscola3ESPA.instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record DadosCadastroInstrutor(
        String nome,
        String email,
        String telefone,
        String cnh,
        String especialidade,
        EnderecoDto endereco) {
}