package com.victormdn.cadmutacoesperiquito.service;

import com.victormdn.cadmutacoesperiquito.dto.MutacaoDTO;
import org.springframework.stereotype.Service;

@Service
public class TerveService {
    public MutacaoDTO testeInicial(MutacaoDTO p1){
        p1.setNome("blue" + p1.getNome());
        p1.setGene("recessive" + p1.getGene());
        return p1;
    }

    public MutacaoDTO testePost(MutacaoDTO body) {
        body.setNome("dark factor"  + body.getNome());
        body.setGene("autosomal recessive"  + body.getGene());
        return body;
    }
}
