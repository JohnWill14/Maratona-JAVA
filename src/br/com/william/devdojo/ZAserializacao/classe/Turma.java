/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZAserializacao.classe;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Turma {
    private String  nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + '}';
    }
    
}
