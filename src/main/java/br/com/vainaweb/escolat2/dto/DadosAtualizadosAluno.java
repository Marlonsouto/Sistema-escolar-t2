package br.com.vainaweb.escolat2.dto;

import br.com.vainaweb.escolat2.enums.CursoEnum;

public record DadosAtualizadosAluno(String nome, String Email, CursoEnum cursoEnum) {
}
