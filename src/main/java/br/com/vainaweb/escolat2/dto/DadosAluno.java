package br.com.vainaweb.escolat2.dto;

import br.com.vainaweb.escolat2.enums.CursoEnum;
import br.com.vainaweb.escolat2.model.Endereco;

public record DadosAluno(String nome, String cpf, String email, CursoEnum curso, String Telefone, Endereco endereco) {
}
