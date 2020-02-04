/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Cconstrutores.classe;

/**
 *
 * @author usuario
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    public Funcionario(String nome){
        this.nome=nome;
        System.out.println("br.com.william.devdojo.construtores.classe.Funcionario.<init>()");
    }
    public Funcionario(){}
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
