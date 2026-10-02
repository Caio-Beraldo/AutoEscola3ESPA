package br.com.fiap.AutoEscola3ESPA.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    public endereco(EnderecoDto corpo){
        this.logradouro = corpo.logradouro();
        this.numero = corpo.numero();
        this.complemento = corpo.complemento();
        this.bairro = corpo.bairro();
        this.cidade = corpo.cidade();
        this.cep = corpo.cep();
        this.uf = corpo.uf();

    }

    public void atualizarInformacoes(EnderecoDto dados) {
        if (dados.logradouro() != null && dados.logradouro().isBlank()) {
            this.logradouro = dados.logradouro();
        }
        if (dados.numero() != null && dados.numero().isBlank()) {
            this.numero = dados.numero();
        }
        if (dados.complemento() != null && dados.complemento().isBlank()) {
            this.complemento = dados.complemento();
        }
        if (dados.bairro() != null && dados.bairro().isBlank()) {
            this.bairro = dados.bairro();
        }
        if (dados.cidade() != null && dados.cidade().isBlank()) {
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null && dados.uf().isBlank()) {
            this.uf = dados.uf();
        }
        if (dados.cep() != null && dados.cep().isBlank()) {
            this.cep = dados.cep();
        }
    }
}
