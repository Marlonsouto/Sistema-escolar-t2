package br.com.vainaweb.escolat2.controller;

import br.com.vainaweb.escolat2.dto.DadosAluno;
import br.com.vainaweb.escolat2.model.Aluno;
import br.com.vainaweb.escolat2.repository.AlunoRepository;
import br.com.vainaweb.escolat2.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")

public class AlunoCrontroller {

    AlunoRepository alunoRepository;
    AlunoService alunoService;
    @PostMapping
    public ResponseEntity<Aluno> atualizarAluno(@RequestBody @Valid DadosAluno dadosAluno ){
        alunoService.salvarAluno(dadosAluno);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping({"/id"})
    public ResponseEntity<Aluno> listarAluno (){
        var alun = alunoService.ListarAlunos();
        return ResponseEntity.status(HttpStatus.OK).build();

    }
}