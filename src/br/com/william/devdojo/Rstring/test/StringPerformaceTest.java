/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Rstring.test;

/**
 *
 * @author usuario
 */
public class StringPerformaceTest {
    public static void main(String[] args) {
        int temp=14000000;
        //String usual
        long inicio=System.currentTimeMillis();
        //concatString(temp);
        
        long fim=System.currentTimeMillis();
        System.out.println("Tempo String: "+(fim-inicio)+" ms");
        
        //StringBuilder
        inicio=System.currentTimeMillis();
        concatStringBuilder(temp);
        
        fim=System.currentTimeMillis();
        System.out.println("Tempo StringBuilder: "+(fim-inicio)+" ms");
        
        //StringBuffer
        inicio=System.currentTimeMillis();
        concatStringBuffer(temp);
        
        fim=System.currentTimeMillis();
        System.out.println("Tempo StringBuffer: "+(fim-inicio)+" ms");
    }
    private static void concatString(int tam){
        String str="";
        int tamOrig=tam;
        while(tam-- >0){
            str+=Integer.toString(tam-tamOrig);
        }
    }
    private static void concatStringBuilder(int tam){
        StringBuilder str=new StringBuilder(tam);
        int tamOrig=tam;
        while(tam-- >0){
            str.append(Integer.toString(tam-tamOrig));
        }
    }
    private static void concatStringBuffer(int tam){
        StringBuffer str=new StringBuffer(tam);
        int tamOrig=tam;
        while(tam-- >0){
            str.append(Integer.toString(tam-tamOrig));
        }
    }
}
