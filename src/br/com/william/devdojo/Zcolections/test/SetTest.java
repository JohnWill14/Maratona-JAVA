/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Produto;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Produto> listaProdutos=new HashSet<>();
        Produto produto1=new Produto(5L, "knife", 35.78, 23);
        Produto produto2=new Produto(2L, "macBook", 56.78, 0);
        Produto produto3=new Produto(3L, "nokia tijolão", 115d, 0);
        Produto produto4=new Produto(4L, "mario kart", 225.78, 3);
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto4);
        
        
        System.out.println("Usando HashSet:\n");
        //Reordena desfazendo a ordem de inserção
        for(Produto pro:listaProdutos){
            System.out.println(pro);
        }
        System.out.println("\nUsando LinkedHashSet:\n");
        Set<Produto> listaLinkedProdutos=new LinkedHashSet<>();
        listaLinkedProdutos.add(produto4);
        listaLinkedProdutos.add(produto3);
        listaLinkedProdutos.add(produto1);
        listaLinkedProdutos.add(produto2);
        
        //Mantém a ordem de inserção sendo mais chique !
        for(Produto pro:listaLinkedProdutos){
            System.out.println(pro);
        }
    }
}
