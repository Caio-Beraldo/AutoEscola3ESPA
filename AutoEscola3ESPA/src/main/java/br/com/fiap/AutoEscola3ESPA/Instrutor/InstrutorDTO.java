package br.com.fiap.AutoEscola3ESPA.Instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDto;
// O record faz com que o codigo fique mais simples e nao precise coloca final e getters para dar request
public record InstrutorDTO(String nome, String email, String telefone, String cnh, String especialidade, EnderecoDto endereco) {

}
