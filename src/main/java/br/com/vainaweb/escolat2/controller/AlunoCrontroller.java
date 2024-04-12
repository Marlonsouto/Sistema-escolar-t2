package br.com.vainaweb.escolat2.controller;

import br.com.vainaweb.escolat2.dto.DadosAluno;
import br.com.vainaweb.escolat2.dto.DadosAtualizadosAluno;
import br.com.vainaweb.escolat2.model.Aluno;
import br.com.vainaweb.escolat2.repository.AlunoRepository;
import br.com.vainaweb.escolat2.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")

public class AlunoCrontroller {

    AlunoRepository alunoRepository;
    AlunoService alunoService;
    @PostMapping
    public void SalvarAluno(@RequestBody @Valid DadosAluno dadosAluno ){
        alunoService.salvarAluno(dadosAluno);
        ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping({"/id"})
    public ResponseEntity<Aluno> listarTodosAlunos (@PathVariable @Valid Long id){
        var alun = alunoService.ListarTodosAlunos();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> listarAlunoByid (@PathVariable @Valid Long id){
       var resposta = alunoRepository.listaDeTodosAlunoPorId(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PutMapping
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @Valid @RequestBody DadosAtualizadosAluno dados ){

        alunoService.atualizarAluno(id, dados);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}