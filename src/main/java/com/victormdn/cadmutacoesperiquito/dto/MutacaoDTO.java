package com.victormdn.cadmutacoesperiquito.dto;


public class MutacaoDTO {
    private String nome;

    private String gene;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getNome() {
        return nome;
    }

    public String getGene() {
        return gene;
    }
}
