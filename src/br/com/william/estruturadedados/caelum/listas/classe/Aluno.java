/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.caelum.listas.classe;

/**
 *
 * @author usuario
 */
public class Aluno {
    private String nome;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }

    
    @Override
    public boolean equals(Object o){
        Aluno al=(Aluno)o;
        return this.getNome().equals(al.getNome());
    }
}
