package br.com.vainaweb.escolat2.dto;

import br.com.vainaweb.escolat2.enums.CursoEnum;
import br.com.vainaweb.escolat2.model.Endereco;

public record DadosAtualizadosAluno (String nome, String telefone, Endereco endereco, CursoEnum cursoEnum) {

}
