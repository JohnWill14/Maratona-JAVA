/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.KEnum.Classe;

/**
 *
 * @author usuario
 */
public enum TipoPessoa {
    PESSOA_FISICA(1,"Pessoa Fisica"),PESSOA_JURIDICA(2,"Pessoa Juridica");// Vem antes de td. Primeira linha
    // /\
    ///  \
    // | Chama o construtor
    private int tipo;
    private String nome;
    private TipoPessoa(int tipo,String nome) {//Construtores private esse he novo :)
        this.tipo = tipo;
        this.nome=nome;
        System.out.println("Chamei Enum Pessoa "+tipo);
    }

    

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
    
}//Separado por virgula
