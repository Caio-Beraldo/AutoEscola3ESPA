package br.com.fiap.AutoEscola3ESPA.Instrutor;


import br.com.fiap.AutoEscola3ESPA.Instrutor.instrutor;

public record DadosListagemInstrutor(
        Long id,
        String nome,
        String email,
        String especialidade) {
    public DadosListagemInstrutor(instrutor instrutor) {
        this(
                instrutor.getId(),
                instrutor.getNome(),
                instrutor.getEmail(),
                instrutor.getEspecialidade()
        );
    }
}