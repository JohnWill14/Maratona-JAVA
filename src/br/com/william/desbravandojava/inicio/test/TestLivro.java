/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.inicio.test;

import br.com.william.desbravandojava.inicio.classe.Livro;

/**
 *
 * @author usuario
 */
public class TestLivro {
    public static void main(String[] args) {
        Livro[] livros=new Livro[3];
        livros[0]=new Livro();
        livros[0].setNome("JAVA, isso que he linguagem");
        livros[0].setDescricao("Te deixar F*da em JAVA!!!");
        livros[0].setValor(300d);
        livros[0].setIsbn("111");
        
        livros[1]=new Livro();
        livros[1].setNome("O nevoeiro");
        livros[1].setDescricao("Criaturas invadem nossa dimensão e ficam\n"
                + "junto a um nevoeiro à procura de alimento, voce!\n"
                + "Será o fim ? Será o apocalipse ?");
        livros[1].setValor(100d);
        livros[1].setIsbn("222");
        livros[2]=new Livro();
        for(Livro livro:livros){
            livro.print();
            System.out.println("===========================\n");
        }
    }
}
