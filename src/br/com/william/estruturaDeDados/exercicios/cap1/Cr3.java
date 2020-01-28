/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.exercicios.cap1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Cr3 {
    public static ArrayList<String> lista;
    public static  void combina(int[] args,String sub){
        if(sub.length() ==args.length)return;
        String str=new StringBuffer(sub).toString();
        for(int i=0;i<args.length;i++){
            if(str.contains(Integer.toString(args[i])))continue;
            sub=new StringBuffer(str).toString();
            sub+=" "+Integer.toString(args[i]);
            
            
            combina(args, sub);
            
        }
        if(sub.length()==args.length)
        lista.add(sub);
        
    }
    
    public static void main(String[] args) {
        lista=new ArrayList<>();
        combina(new int[]{1,2,3,4},  "");
        Set<String> set=new HashSet();
        for(String i:lista){
            System.out.println(i);
            set.add(i);
        }
        System.out.println("A lista diz: "+lista.size());
        
        System.out.println("O set diz: "+lista.size());
    }
}
