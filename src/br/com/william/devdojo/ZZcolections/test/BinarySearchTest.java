/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */ 
public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList();
        lista.add(22);
        lista.add(3);
        lista.add(4);
        lista.add(0);
        lista.add(1);
        lista.add(9);
        lista.add(7);
        lista.add(7);
//    Se não encontrar =>  ( -(ponto_de_insercao)-1)
        Collections.sort(lista);
        //0,1,2,3,4,5,6
        //0,1,2,3,4,7,9
       int index= Collections.binarySearch(lista,2);// A lista Tem que estar ordenado
        System.out.println("Index: "+index);
    }
}
