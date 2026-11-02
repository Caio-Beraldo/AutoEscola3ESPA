package br.com.fiap.AutoEscola3ESPA.Aluno;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;

public record AlunoDTO(String nome, String email, String telefone, String cpf, EnderecoDto endereco) {
}
