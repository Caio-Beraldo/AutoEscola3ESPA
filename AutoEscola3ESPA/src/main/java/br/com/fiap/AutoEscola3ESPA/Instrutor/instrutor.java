package br.com.fiap.AutoEscola3ESPA.Instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Entity(name="instrutor")
@Table(name="instrutores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome;
    private  String email;
    private  String telefone;
    private  String cnh;
    private  String especialidade;

    @Embedded
    private endereco endereco;

    public instrutor(InstrutorDTO corpo){
        this.nome = corpo.nome();
        this.email = corpo.email();
        this.telefone = corpo.telefone();
        this.cnh = corpo.cnh();
        this.especialidade = corpo.especialidade();
        this.endereco = new endereco(corpo.endereco());
    }


    public void atualizarInformacoes(DadosAtualizacaoInstrutor dados) {
        if(dados.nome() != null && dados.nome().isBlank()){
            this.nome = dados.nome();
        }
        if(dados.email() != null && dados.email().isBlank()){
            this.email = dados.email();
        }
        if(dados.especialidade() != null && dados.especialidade().isBlank()){
            this.especialidade = dados.especialidade();
        }
        if(dados.telefone() != null && dados.telefone().isBlank()){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null){
            endereco.atualizarInformacoes(dados.endereco());
        }
    }
}
