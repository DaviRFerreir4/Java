package br.com.daviferreira.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MeuComponente {
    public String chamarComponente() {
        return "Chamando componente";
    }
}
