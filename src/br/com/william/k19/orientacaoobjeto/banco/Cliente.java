/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.orientacaoobjeto.banco;

/**
 *
 * @author usuario
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private char sexo;
    
    public Cliente(){
        super();
    }
    public Cliente(String nome,String cpf,String rg,int idade,char sexo){
        this.nome=nome;
        this.cpf=cpf;
        this.rg=rg;
        this.idade=idade;
        this.sexo=sexo;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
