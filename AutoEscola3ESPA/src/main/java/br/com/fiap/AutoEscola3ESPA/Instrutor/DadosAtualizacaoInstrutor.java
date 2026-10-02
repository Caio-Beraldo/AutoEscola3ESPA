package br.com.fiap.AutoEscola3ESPA.Instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record DadosAtualizacaoInstrutor(Long id, String nome, String email, String telefone, String especialidade, EnderecoDto endereco) {

}
