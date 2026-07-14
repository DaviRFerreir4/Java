package br.com.daviferreira.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class PrimeiraController {

    @GetMapping("/hello-world")
    public String primeiroMetodo() {
        return "Hello, World! Esse é meu primeiro método";
    }

    // função com route params
    @GetMapping("/metodo-com-route-params/{id}")
    public String metodoComRouteParams(@PathVariable(name = "id") String outroNome) {
        return String.format("Usuário retornado através de route params: %s",
                outroNome);
    }

    // função com query params
    @GetMapping("/metodo-com-query-params")
    public String metodoComQueryParams(@RequestParam String id) {
        return String.format("Usuário retornado através de query params: %s",
                id);

    }

    // função com query params num map
    @GetMapping("/metodo-com-query-params-usando-map")
    public String metodoComQueryParamsPegandoTudo(@RequestParam Map<String,
            String> allParams) {
        return String.format("Usuário retornado através de query params: %s",
                allParams.entrySet());
    }

    // função com body params
    @PostMapping("/metodo-com-body-params")
    public String metodoComBodyParams(@RequestBody User user) {
        return user.username();
    }

    record User(String username, Integer age) {
    }

    // função com body params
    @PostMapping("/metodo-com-headers")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return name;
    }

    // função com body params
    @PostMapping("/metodo-com-list-headers")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers) {
        return headers.entrySet().toString();
    }

    // função com retorno de response entity
    @GetMapping("/metodo-response-entity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable String id) {
        if (Integer.parseInt(id) > 10) {
            return ResponseEntity.status(201).body(id);
        }
        return ResponseEntity.status(400).body("Número menor ou igual a 10");
    }
}
