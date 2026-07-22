package br.com.daviferreira.gestao_vagas.modules.candidate.controllers;

import br.com.daviferreira.gestao_vagas.modules.candidate.CandidateEntity;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidate) {
        System.out.println("candidato " + candidate.getName());
    }

    @GetMapping("/")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok().body("ok");
    }
}
