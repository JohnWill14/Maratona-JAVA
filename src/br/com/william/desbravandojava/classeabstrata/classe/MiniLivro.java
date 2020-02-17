/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.classeabstrata.classe;

import br.com.william.desbravandojava.inicio.classe.Autor;

/**
 *
 * @author usuario
 */
public class MiniLivro  extends Livro{

    public MiniLivro() {
        super();
    }

    public MiniLivro(String nome, double valor, String descricao, Autor autor) {
        super(nome, valor, descricao, autor);
    }

    @Override
    protected boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
    
    
}
