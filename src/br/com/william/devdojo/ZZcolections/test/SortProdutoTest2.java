/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import br.com.william.devdojo.ZZcolections.classe.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author usuario
 */
public class SortProdutoTest2 {
    private static class ProdutoNomeComparetor implements Comparator<Produto>{

        @Override
        public int compare(Produto t, Produto t1) {
            return (t.getPreco().compareTo(t1.getPreco()))*-1;
        }
        
    }
    public static void main(String[] args) {
        List<Produto> lista=new ArrayList();
        Produto produto1=new Produto(1L,"lepTop",1200.90);
        Produto produto2=new Produto(2L,"bIA(Bradesco)",7600.90);
        Produto produto5=new Produto(4L,"bIA(Bradesco)",8000.90);
        Produto produto3=new Produto(3L,"eggs",6.90);
        Produto produto4=new Produto(3L,"teclado he isso aí tá ok",78.90);
        
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produto4);
        lista.add(produto5);
        
        Collections.sort(lista, new ProdutoNomeComparetor());
        for(Produto pod:lista){
            System.out.println(pod);
        }
        
    }
}
