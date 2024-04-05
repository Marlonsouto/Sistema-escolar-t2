package br.com.vainaweb.escolat2.model;

import br.com.vainaweb.escolat2.enums.CursoEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "tb_alunos")
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aluno;

    @Getter @Setter
    @Column( nullable = false)
    private String nome;
    @Getter
    private CursoEnum curso;

    @Getter
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    //ex:+55 91 00000-0000

    @Getter
    @Pattern(regexp= "\\+\\d{2}-\\d{2}\\d{5}-\\d{4}")
    private String telefone;

    @Getter @Setter
    @Pattern(regexp= "\\d{3}-\\d{3}-\\d{3}-\\d{2}")
    @Column(unique = true, nullable = false)
    private String cpf;

    @Getter
    @Embedded
    @Column(unique = true)
    private Endereco endereco;

    public Aluno(String nome, CursoEnum curso, String email, String telefone, String cpf, Endereco endereco) {
        this.nome = nome;
        this.curso = curso;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso=" + curso +
                ", email='" + email + '\'' +
                '}';
    }
}
