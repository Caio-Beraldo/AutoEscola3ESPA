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

}
