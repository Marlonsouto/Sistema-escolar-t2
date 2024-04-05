package br.com.vainaweb.escolat2.repository;

import br.com.vainaweb.escolat2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findAllById(int id);
}
