package br.com.daviferreira.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class ControllerComponente {
    @Autowired
    MeuComponente meuComponente;

    @GetMapping("")
    public String chamarComponente() {
        var resultado = meuComponente.chamarComponente();
        return resultado;
    }
}
