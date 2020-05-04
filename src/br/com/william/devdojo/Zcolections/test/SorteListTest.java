/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class SorteListTest {
    public static void main(String[] args) {
        List<String> nomes=new ArrayList<>();
        nomes.add("John william");
        nomes.add("UEM");
        nomes.add("INFORMATICA");
        Collections.sort(nomes);
        
        for(String nome:nomes){
            System.out.println(nome);
        }
    }
}
