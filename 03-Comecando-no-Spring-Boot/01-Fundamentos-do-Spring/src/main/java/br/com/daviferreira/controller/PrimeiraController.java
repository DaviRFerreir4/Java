package br.com.daviferreira.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class PrimeiraController {

    @GetMapping("/hello-world")
    public String primeiroMetodo() {
        return "Hello, World! Esse é meu primeiro método";
    }

    // método com route params
    @GetMapping("/users/{id}")
    public String showUser(@PathVariable(name = "id") String outroNome) {
        return String.format("Usuário retornado através de route params: %s",
                outroNome);
    }

    // método com query params
    @GetMapping("/users")
    public String indexUsers(@RequestParam String id) {
        return String.format("Usuário retornado através de query params: %s",
                id);

    }

    // método com query params num map
    @GetMapping("/users-with-filters")
    public String indexUsersWithFilters(@RequestParam Map<String, String> allParams) {
        return String.format("Usuário retornado através de query params: %s",
                allParams.entrySet());
    }
}
