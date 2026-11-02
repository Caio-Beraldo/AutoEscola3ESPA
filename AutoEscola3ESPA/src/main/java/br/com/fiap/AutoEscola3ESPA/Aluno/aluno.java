package br.com.fiap.AutoEscola3ESPA.Aluno;

import br.com.fiap.AutoEscola3ESPA.endereco.endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Entity(name="aluno")
@Table(name="alunos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome;
    private  String email;
    private  String telefone;
    private  String cpf;

    @Embedded
    private endereco endereco;

    public aluno(AlunoDTO corpo){
        this.nome = corpo.nome();
        this.email = corpo.email();
        this.telefone = corpo.telefone();
        this.cpf = corpo.cpf();
        this.endereco = new endereco(corpo.endereco());
    }


    public void atualizarInformacoes(DadosAtualizacaoAluno dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}
