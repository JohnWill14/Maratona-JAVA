/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.usointerface.classe.livros;

import br.com.william.desbravandojava.heranca.classe.*;
import br.com.william.desbravandojava.inicio.classe.Autor;
import br.com.william.desbravandojava.usointerface.classe.Promocional;

/**
 *
 * @author usuario
 */
public class Ebook extends Livro implements Promocional{
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
    public void imprimi() {
        super.imprimi(); 
//        this.olamundo();
        System.out.println("Marca da agua:  "+this.getMarcaDaagua());
    }

    @Override
    public boolean aplicaDescontoDe(double desconto) {
        if(desconto>12)return false;
        this.setValor(this.getValor()*(1-(desconto/100)));
        return true;
    }
    
}
