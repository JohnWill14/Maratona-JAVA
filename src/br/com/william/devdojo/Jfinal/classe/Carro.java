/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Jfinal.classe;

/**
 *
 * @author usuario
 */
public class Carro {
    public static final double VELOCIDADE_LIMITE=500;//Obrigado a inicializala
    public final StringBuffer SB;
    private String nome;
    private String marca;
    {
        SB=new StringBuffer();
    }
    public Carro() {
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    //Nao pode sobrescrever o metodo
    public final void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }
    
}
