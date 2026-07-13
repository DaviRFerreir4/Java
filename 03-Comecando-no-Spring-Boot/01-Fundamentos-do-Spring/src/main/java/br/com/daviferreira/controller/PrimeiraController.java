package br.com.daviferreira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class PrimeiraController {

    @GetMapping()
    public String primeiroMetodo() {
        return "Hello, World! Esse é meu primeiro método";
    }

}
