/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.usointerface.classe.revista;

import br.com.william.desbravandojava.usointerface.classe.Imprimi;
import br.com.william.desbravandojava.usointerface.classe.Produto;
import br.com.william.desbravandojava.usointerface.classe.Promocional;

/**
 *
 * @author usuario
 */
public class Revista implements Produto, Promocional,Imprimi{
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public Revista(String nome, String descricao, double valor, Editora editora) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.editora = editora;
    }

    public Revista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public void imprimi() {
           System.out.println("Nome:      "+this.getNome());
           System.out.println("Descricao: "+this.getDescricao());
           System.out.println("Editora:   "+this.getEditora().getNome());
           System.out.println("Valor:     "+this.getValor());
    }

    @Override
    public boolean aplicaDescontoDe(double desconto) {
        if(desconto>7)return false;
        this.setValor(this.getValor()*(1-(desconto/100)));
        return true;
    }
    
}
