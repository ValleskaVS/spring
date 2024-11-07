package alunos.proa.primeira.spring.controller;

import alunos.proa.primeira.spring.Repository.ProfessorRepository;
import alunos.proa.primeira.spring.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
        return ResponseEntity.ok("Professor adicionado com sucesso!");
    }

    @GetMapping("/List")
    public ResponseEntity<List<Professor>> listProfessores() {
        List<Professor> professores = professorRepository.findAll();
        return ResponseEntity.ok(professores);
    }
}
