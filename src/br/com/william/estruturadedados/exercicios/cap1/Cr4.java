/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.exercicios.cap1;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cr4 {
    private static ArrayList<String> lista;
    public static void combina(char[] array,String sub){
        if(sub.length()==array.length)return;
        String str=new StringBuffer(sub).toString();
        for(int i=0;i<array.length;i++){
            if(str.contains(Character.toString(array[i])))continue;
            sub=new StringBuffer(str).toString();
            sub+=Character.toString(array[i]);
            lista.add(sub);
            combina(array, sub);
        }
        
    }
    public static void main(String[] args) {
        lista=new ArrayList<>();
        combina(new char[]{'a','b','c'}, "");
        for(String i:lista){
            System.out.println(i);
        }
    }
}
