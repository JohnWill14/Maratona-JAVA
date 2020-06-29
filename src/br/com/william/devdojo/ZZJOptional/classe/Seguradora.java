/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZJOptional.classe;

import java.util.Optional;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Seguradora {
    private String nome;

    public Seguradora() {
    }

    public Seguradora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Seguradora{" + "nome=" + nome + '}';
    }
    
    
}
