/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Bmetodos.classe;

/**
 *
 * @author usuario
 */
public class Professor {
    private String nome;
    private String matricula;
    private String rg;
    private String cpf;

    public Professor() {
        super();
    }

    public Professor(String nome, String matricula, String rg, String cpf) {
        this();
        this.nome = nome;
        this.matricula = matricula;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void print(){
        System.out.println("Nome"+this.getNome());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("RG: "+this.getRg());
        System.out.println("CPF: "+this.getCpf());
    }
    
}
