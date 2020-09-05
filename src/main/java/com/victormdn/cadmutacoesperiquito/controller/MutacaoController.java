package com.victormdn.cadmutacoesperiquito.controller;

import com.victormdn.cadmutacoesperiquito.model.Mutacao;
import com.victormdn.cadmutacoesperiquito.repository.MutacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("/{id}")
    public Mutacao getById(@PathVariable Long id){
        return mutacaoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Mutacao post(@RequestBody Mutacao mutacao){
        if (mutacao.getId() != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O campo id deve estar em branco.");
        return mutacaoRepository.save(mutacao);
    }

    @PutMapping
    public Mutacao put(@RequestBody Mutacao mutacao){
        validateId(mutacao.getId());
        return mutacaoRepository.save(mutacao);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable Long id){
        validateId(id);
        mutacaoRepository.deleteById(id);
    }

    private void validateId(Long id){
        if(id == null || !mutacaoRepository.findById(id).isPresent())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O campo id deve ser um valor já existente.");
    }
}
