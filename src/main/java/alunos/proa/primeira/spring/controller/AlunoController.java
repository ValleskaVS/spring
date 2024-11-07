package alunos.proa.primeira.spring.controller;

import alunos.proa.primeira.spring.Repository.AlunoRepository;
import alunos.proa.primeira.spring.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")

public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAluno(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
        return ResponseEntity.ok("Aluno adicionado com sucesso!");
    }

    @GetMapping("/List")
    public ResponseEntity<List<Aluno>> listAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();
        return ResponseEntity.ok(alunos);
    }
}
