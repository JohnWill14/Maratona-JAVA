/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.classeabstrata.test;

import br.com.william.desbravandojava.heranca.test.*;
import br.com.william.desbravandojava.heranca.classe.Ebook;
import br.com.william.desbravandojava.heranca.classe.Livro;
import br.com.william.desbravandojava.heranca.classe.LivroFisico;
import br.com.william.desbravandojava.inicio.classe.Autor;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class TestLivroEEbook {
    private static ArrayList carrinho;
    static {
        carrinho=new ArrayList<Livro>();
    }
    public static void adicionaCarrinho(Livro livro){
        carrinho.add(livro);
    }
   
    public static void main(String[] args) {
        Autor autor=new Autor();
        autor.setNome("John William Vicente");
        autor.setEmail("johnwill.v.2017@gmail.com");
        autor.setCpf("484.983.333-22");
        
        LivroFisico livro=new LivroFisico();
        livro.setNome("JAVA é da hora");
        livro.setValor(500d);
        livro.setDescricao("Cara he muita coisa, logo R$ 500,00!");
        livro.setAutor(autor);
        livro.setTaxaImpresao(20d);
        
        livro.imprimir();
        
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        Ebook ebook=new Ebook();
        ebook.setNome("Xena a princesa guerreira");
        ebook.setDescricao("Uma guerreira em busca da reconcilhação do seu interior.Não original");
        ebook.setValor(60d);
        ebook.setAutor(autor);
        ebook.setMarcaDaagua("Monica da Silva Costa");
        ebook.imprimir();
        
        adicionaCarrinho(ebook);
        adicionaCarrinho(livro);
        System.out.println("\n\n-------------------------------\n"
                + "QTD de livros no carrinho: "+carrinho.size()+"\n\n");
        Livro l=(Livro)carrinho.get(0);
        l.imprimir();
    }
}
