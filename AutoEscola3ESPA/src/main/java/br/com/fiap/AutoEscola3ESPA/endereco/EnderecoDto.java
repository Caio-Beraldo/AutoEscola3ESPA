package br.com.fiap.AutoEscola3ESPA.endereco;

public record EnderecoDto(String logradouro, String numero, String complemento, String bairro, String cidade, String uf, String cep) {
    public EnderecoDto(endereco endereco) {
        this(endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(),endereco.getBairro(),endereco.getCidade(),endereco.getCep(),endereco.getUf());
    }
}
