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
public class StringBuilderTest {
    public static void main(String[] args) {
        String s="Recebe uma frase comum";
        StringBuilder sb=new StringBuilder(10);//Espaço de 10 caracteres. default 16 caracteres
        sb.append(s+" Apenas isso mesmo");
        
        System.out.println(sb);
        
        System.out.println("=================");
        StringBuilder texto=new StringBuilder("texto");
        System.out.println("Texto: "+texto);
        System.out.println("Reverse: "+texto.reverse());
        texto.reverse();
        System.out.println("Delete: "+texto.delete(0, 1));
        texto.reverse();
        texto.append('t');
        texto.reverse();
        System.out.println("Insert: "+texto.insert(0, "1- "));
        System.out.println("");
    }
}
