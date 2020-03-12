/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Minterface.classe;

/**
 *
 * @author usuario
 */
public class Produto implements Tributavel{
    public String nome;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public void calculaImposto() {
        double preco=this.preco+this.preco*Tributavel.IMPOSTO;
        this.setPreco(preco);
        this.imprime();
    }
    
}
