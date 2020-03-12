/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Labstract.classe;

/**
 *
 * @author usuario
 */
public abstract class Pessoa {
    protected String nome;
    public abstract void imprimi();//Deve ser implementada na primeira classe concreta !!!
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
