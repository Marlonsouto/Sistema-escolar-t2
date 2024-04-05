package br.com.vainaweb.escolat2.service;

import br.com.vainaweb.escolat2.dto.DadosAluno;
import br.com.vainaweb.escolat2.enums.CursoEnum;
import br.com.vainaweb.escolat2.model.Aluno;
import br.com.vainaweb.escolat2.model.Endereco;
import br.com.vainaweb.escolat2.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class AlunoService {

    private AlunoRepository alunoRepository;

    public void salvarAluno(DadosAluno dadosAluno) {
        var aluno = new Aluno(dadosAluno.nome(), dadosAluno.curso(), dadosAluno.email(), dadosAluno.telefone(),
                dadosAluno.cpf(), dadosAluno.endereco());
        alunoRepository.save(aluno);

    }

    public List<Aluno> ListarAlunos() {
        var alunoList = alunoRepository.findAll();
        return alunoList;
    }

    //public

}

