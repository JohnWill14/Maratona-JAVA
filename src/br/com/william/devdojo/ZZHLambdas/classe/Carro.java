/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.classe;

import br.com.william.devdojo.ZZGcomportamentoporparametro.classe.*;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Carro {
    private String nome="Gol";
    private Cores cor;
    private int ano;

    public Carro(Cores cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", cor=" + cor + ", ano=" + ano + '}';
    }
    
}
