/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.test;

import br.com.william.devdojo.Zcolections.classe.Celular;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class GenericTest {
    public static void main(String[] args) {
        //type erasure
        //Na compilação o java substitui String por Object no caso a String só 
        //existe na compilação e na ide
        List<String> lista=new ArrayList<>();
        lista.add("String");
        lista.add("Iphone");
        lista.add("5L");
        for(String o:lista){
            System.out.println(o);
        }
        System.out.println("=================");
        add(lista,1L);
        
        for(Object o:lista){
            System.out.println(o+" - "+o.getClass().getSimpleName());
        }
    }
    private static void add(List lista,Object o){
        lista.add(o);
    }
}
