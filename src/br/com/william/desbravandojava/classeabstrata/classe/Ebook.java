/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.classeabstrata.classe;

import br.com.william.desbravandojava.heranca.classe.*;
import br.com.william.desbravandojava.inicio.classe.Autor;

/**
 *
 * @author usuario
 */
public class Ebook extends Livro {
    private String marcaDaagua;

    public Ebook() {
        super();
    }

    public Ebook(String marcaDaagua, String nome, double valor, String descricao, Autor autor) {
        super(nome, valor, descricao, autor);
        this.marcaDaagua = marcaDaagua;
    }

    public String getMarcaDaagua() {
        return marcaDaagua;
    }

    public void setMarcaDaagua(String marcaDaagua) {
        this.marcaDaagua = marcaDaagua;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
//        this.olamundo();
        System.out.println("Marca da agua:  "+this.getMarcaDaagua());
    }

    @Override
    protected boolean aplicaDescontoDe(double porcentagem) {
         if(porcentagem>10)return false;
        this.setValor(this.getValor()*(porcentagem/100));
        return true;
    }
    
}
