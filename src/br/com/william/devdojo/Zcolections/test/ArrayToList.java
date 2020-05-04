/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] nomes=new String[5];
        nomes[0]="Leticia";
        nomes[1]="Douglas";
        nomes[2]="Bia";
        nomes[3]="Jair Mesquita";
        nomes[4]="William Vicente";
        
        System.out.println("Tipo: "+nomes.getClass().getSimpleName());
        System.out.println("Tamanho: "+nomes.length);
        System.out.println("Conteudo: ");
        for(String nome:nomes)System.out.println("  "+nome);
        System.out.println("\n---------------\nConvertendo 1 2 3\n");
        
        List<String> nomesList=Arrays.asList(nomes);
        
        System.out.println("Tipo: "+nomesList.getClass().getSimpleName());
        System.out.println("Tamanho: "+nomesList.size());
        System.out.println("Conteudo: ");
        for(String nome:nomesList)System.out.println("  "+nome);
        System.out.println("\n---------------\nReconvertendo 1 2 3\n");
        nomes=new String[5];
//        nomes=(String[])nomesList.toArray();
        nomesList.toArray(nomes);
        System.out.println("Tipo: "+nomes.getClass().getSimpleName());
        System.out.println("Tamanho: "+nomes.length);
        System.out.println("Conteudo: ");
        for(String nome:nomes)System.out.println("  "+nome);
    }
}
