/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ListTest {
    public static void main(String[] args) {
//        List nomes=new ArrayList();;
        List<String> nomes=new ArrayList();;
        nomes.add("John");
        nomes.add("William");
        nomes.add("Vicente");
        
        List<String> nomes2=new ArrayList();;
        nomes2.add("John2");
        nomes2.add("William2");
        nomes2.add("Vicente2");
        
        nomes.addAll(nomes2);
        for(Object nome:nomes){
            System.out.println(nome);
        }
//        nomes.removeAll(nomes);
        nomes.clear();
        System.out.println("Size: "+nomes.size());
    }
}
