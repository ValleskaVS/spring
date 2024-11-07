package alunos.proa.primeira.spring.Repository;

import alunos.proa.primeira.spring.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
