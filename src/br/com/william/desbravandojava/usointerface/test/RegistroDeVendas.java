/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.usointerface.test;

import br.com.william.desbravandojava.inicio.classe.Autor;
import br.com.william.desbravandojava.usointerface.classe.CarrinhoDeCompras;
import br.com.william.desbravandojava.usointerface.classe.Produto;
import br.com.william.desbravandojava.usointerface.classe.livros.Ebook;
import br.com.william.desbravandojava.usointerface.classe.revista.Editora;
import br.com.william.desbravandojava.usointerface.classe.livros.Livro;
import br.com.william.desbravandojava.usointerface.classe.livros.LivroFisico;
import br.com.william.desbravandojava.usointerface.classe.revista.Revista;

/**
 *
 * @author usuario
 */
public class RegistroDeVendas {
    private static CarrinhoDeCompras carrinho;
    static{
        carrinho=new CarrinhoDeCompras();
    }
    public static void main(String[] args) {
        Autor autor=new Autor("John William", "122.122.444-10", "johnwv@ymail.com");
        
        Livro arthur=new LivroFisico();
        arthur.setAutor(autor);
        arthur.setNome("As aventuras de Arthur");
        arthur.setDescricao("Reescrita particular em forma de livro de um desenho das antigas");
        arthur.setValor(100);
        
        Ebook livro=new Ebook();
        
        livro.setAutor(autor);
        livro.setNome("Entendendo a sexualidade");
        livro.setDescricao("Uma abordagem para jovens e crianças");
        livro.setValor(20);
        livro.setMarcaDaagua("Damares Serra");
        livro.aplicaDescontoDe10();
        
        Editora editora=new Editora("Vivendo e aprendendo", "morrendo burro", "12222");
        
        Revista revista=new Revista();
        revista.setNome("Todo mundo odeia a ilusao");
        revista.setEditora(editora);
        revista.setValor(30);
        revista.setDescricao("Revista que trata sobre questoes filosoficas da existencia e da humanidade");
        
        carrinho.addCarrinho(arthur);
        carrinho.addCarrinho(revista);
        carrinho.addCarrinho(livro);
        System.out.println("=======  Produtos  =======");
       carrinho.imprimiLista();
        
        System.out.println("Total => R$ "+String.format("%.2f", carrinho.getTotal()));
    }
}
