package com.victormdn.cadmutacoesperiquito.controller;

import com.victormdn.cadmutacoesperiquito.model.Mutacao;
import com.victormdn.cadmutacoesperiquito.repository.MutacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mutacoes")
public class MutacaoController {
    @Autowired
    private MutacaoRepository mutacaoRepository;

    @GetMapping
    public List<Mutacao> getAll(){
        return mutacaoRepository.findAll();
    }

    @PostMapping
    public Mutacao post(@RequestBody Mutacao mutacao){
        return mutacaoRepository.save(mutacao);
    }
}
