/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Hheranca.classe;

/**
 *
 * @author usuario
 */
public class Pessoa{
//    private static final String test;
    private String nome;
    private String cpf;
    private Endereco endereco;
    static{
        System.out.println("Bloco Static");
    }
    {
        System.out.println("Bloco 1");
    }
    {
        System.out.println("Bloco 2");
    }
    /***
     * Cria uma Pessoa :O
     */
    public Pessoa() {
        super();
        System.out.println("Hellow Aqui he o construtor");
       
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Rua: "+this.endereco.getRua());
        System.out.println("Numero: "+this.endereco.getNumero());
    }
}
