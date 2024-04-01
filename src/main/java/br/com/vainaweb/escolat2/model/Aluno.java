package br.com.vainaweb.escolat2.model;

import br.com.vainaweb.escolat2.enums.CursoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "tb_alunos")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {


    @Column()
    private String nome;

    private CursoEnum curso;

    @Email
    @Column(unique = true, nullable = true)
    private String email;

    //ex:+55 91 00000-0000
    @Pattern(regexp= "\\+\\d{2}-\\d{2}\\d{5}\\d{4}")
    private String telefone;

    @Setter
    @Column(unique = true)
    private String cpf;

    @Setter
    @Embedded
    private Endereco endereco;



}
