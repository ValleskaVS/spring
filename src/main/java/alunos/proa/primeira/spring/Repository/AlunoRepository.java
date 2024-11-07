package alunos.proa.primeira.spring.Repository;

import alunos.proa.primeira.spring.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
