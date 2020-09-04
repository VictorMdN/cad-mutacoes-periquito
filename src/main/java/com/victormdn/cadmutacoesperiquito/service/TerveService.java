package com.victormdn.cadmutacoesperiquito.service;

import org.springframework.stereotype.Service;

@Service
public class TerveService {
    public String testeInicial(String p1){
        return "teste 7 3 5 9 " + p1 + " da sua própria escuridão.";
    }

    public String testePost(String body) {
        return "teste DDD 011 " + body;
    }
}
