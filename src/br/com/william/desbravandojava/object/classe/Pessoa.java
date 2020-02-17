/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.object.classe;

/**
 *
 * @author usuario
 */
public class Pessoa {
    private String nome;
    private double altura;
    private String cpf;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, double altura, String cpf) {
        this();
        this.nome = nome;
        this.altura = altura;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome:   "+this.getNome()+
                "\nAltura: "+this.getAltura()+" m"+
                "\nCpf:    "+this.getCpf();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Pessoa))return false;
        Pessoa p=(Pessoa)o;
        if(this.nome.equals(p.getNome())){
            if(this.cpf.equals(p.getCpf())){
                if(this.altura==p.getAltura())
                    return true;
            }
        }
        return false;
    }
    
}
