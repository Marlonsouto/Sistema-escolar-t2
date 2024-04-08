package br.com.vainaweb.escolat2.service;

import br.com.vainaweb.escolat2.dto.DadosAluno;
import br.com.vainaweb.escolat2.model.Aluno;
import br.com.vainaweb.escolat2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void salvarAluno(DadosAluno dadosAluno) {
        var aluno = new Aluno(dadosAluno.nome(), dadosAluno.curso(), dadosAluno.email(), dadosAluno.telefone(),
                dadosAluno.cpf(), dadosAluno.endereco());
        alunoRepository.save(aluno);

    }

    public List<Aluno> ListarAlunos() {

        var alunoList = alunoRepository.findAll();

        if (alunoList.isEmpty()) {
            System.err.println("Lista vazia");
        }
        return alunoList;
    }

    public void deletarAluno(Long id) throws IllegalAccessException {
        if (!alunoRepository.existsById(id)){
            throw new IllegalAccessException("O ID que voce forneceu nao existe");
        }
        alunoRepository.deleteById(id);
    }

    //public void atualizarAluno(){
    // }

}

