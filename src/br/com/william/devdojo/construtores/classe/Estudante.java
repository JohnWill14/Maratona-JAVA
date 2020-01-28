/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.construtores.classe;

/**
 *
 * @author usuario
 */
public class Estudante {
    private String nome;
    private String cpf;
    private double[] notas;

    public Estudante(){
        super();
    }
    public Estudante(String nome,String cpf,double[] notas){
        this();
        this.nome=nome;
        this.cpf=cpf;
        this.notas=notas;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
}
