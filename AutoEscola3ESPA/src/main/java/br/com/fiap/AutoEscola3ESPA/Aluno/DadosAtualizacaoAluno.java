package br.com.fiap.AutoEscola3ESPA.Aluno;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record DadosAtualizacaoAluno(Long id, String nome, String telefone, EnderecoDto endereco) {

}
