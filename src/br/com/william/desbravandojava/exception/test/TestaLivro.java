/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.exception.test;

import br.com.william.desbravandojava.exception.classe.livros.Livro;
import br.com.william.desbravandojava.exception.classe.livros.LivroFisico;

/**
 *
 * @author usuario
 */
public class TestaLivro {
    public static void main(String[] args) {
        Livro livro=new LivroFisico(0, "joana D'ark", 40, "Joana D' ark", null);
        
    }
}
