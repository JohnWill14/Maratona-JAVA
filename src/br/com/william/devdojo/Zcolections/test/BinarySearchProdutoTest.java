/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class BinarySearchProdutoTest {

    public static void main(String[] args) {
//        Produto
        List<Produto> lista = new ArrayList();
        lista.add(new Produto(1L, "notebook", 2540.90));
        lista.add(new Produto(2L, "Knife", 1540.90));
        lista.add(new Produto(3L, "botter", 10.90));
        lista.add(new Produto(5L, "iphone X", 10540.90));

//    Se não encontrar =>  ( -(ponto_de_insercao)-1)
        Collections.sort(lista, new SortProdutoTest2.ProdutoNomeComparetor());
        for (Produto pod : lista) {
            System.out.println(pod);
        }
        //0,1,2,3,4,5,6
        //0,1,2,3,4,7,9
        Produto busca = new Produto(5L, "iphone X", 10540.90);
        /*Passar comparator para que o método binarySearch saiba comparar*/
        int index = Collections.binarySearch(lista, busca, new SortProdutoTest2.ProdutoNomeComparetor());// A lista Tem que estar ordenado
        System.out.println("Index: " + index);
        System.out.println("\n-----------------");
        
        Integer[] numeros=new Integer[5];
        numeros[0]=2;
        numeros[1]=4;
        numeros[2]=3;
        numeros[3]=1;
        numeros[4]=-1;
        Arrays.sort(numeros);
        
        int numero=-2;
        int index2=Arrays.binarySearch(numeros, numero);
        System.out.println("Index("+numero+"): "+index2);
        
    }
}
