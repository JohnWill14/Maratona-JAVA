/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author usuario
 */
public class MetodoGenericTest {
    public static void main(String[] args) {
        criaArray("OLA MUNDO");
        @SuppressWarnings("unchecked")
        List lista=criaList("OLA MUNDO","HLLOW","William suane");
        System.out.println(lista.getClass().getSimpleName());
    }
    public static <T> void criaArray(T t){//<T> vem antes de tudo
        List<T> lista=new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
    public static <T> List<T> criaList(T... t){//<T> vem antes de tudo
        List<T> lista;
        lista=Arrays.asList(t);
        System.out.println(lista);
        System.out.print("[");
        for(T item:lista)System.out.print(item.getClass()+", ");
        System.out.println("]");
        return lista;
    }
}
