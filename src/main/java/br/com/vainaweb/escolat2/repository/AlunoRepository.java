package br.com.vainaweb.escolat2.repository;

import br.com.vainaweb.escolat2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findAllById(int id);

    @Query("nome,email,curso from tb_alunos aluno Where aluno.id =: id ")
    Optional<Set<Aluno>> listaDeAlunoPorId (Long Id);
}
