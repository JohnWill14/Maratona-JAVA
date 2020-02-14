/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.heranca.classe;

import br.com.william.desbravandojava.inicio.classe.Autor;

/**
 *
 * @author usuario
 */
public class LivroFisico extends Livro {
    private double taxaImpresao;

    public LivroFisico() {
    }

    public LivroFisico(double taxaImpresao, String nome, double valor, String descricao, Autor autor) {
        super(nome, valor, descricao, autor);
        this.taxaImpresao = taxaImpresao;
    }

    public double getTaxaImpresao() {
        return taxaImpresao;
    }

    public void setTaxaImpresao(double taxaImpresao) {
        this.taxaImpresao = taxaImpresao;
    }
    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Taxa de impressao:  "+this.getTaxaImpresao());
    }
}
