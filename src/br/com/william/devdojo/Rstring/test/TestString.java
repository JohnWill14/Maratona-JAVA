/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Rstring.test;

import java.io.PrintStream;

/**
 *
 * @author usuario
 */
public class TestString {
    private static PrintStream ps;
    static{
        ps=System.out;
    }
    public static void main(String[] args) {
        // String é imutavel, nao muda nunca
        //new String é desnessesário pela performace
        String nome1="John";//Criando uma váriavel no pool String e fazendo referencia a ela
        String nomeCompleto=nome1.concat(" William");
        String nome2="Nicole";// Criando uma variavel de referencia do tipo string e uma string no pool de strings; 
        ps.println("Nome: "+nome1);
        ps.println("Nome Completo: "+nomeCompleto);
        if(nome1==new String("John"))ps.println("Sao iguais");
        else ps.println("Nao sao iguais");
        ps.println("\n============================\n");
        
        String texto="Xena";
        ps.println("Texto: "+texto);
        ps.println("charAt: "+texto.charAt(1));
        ps.println("equalsIgnoreCase: "+texto.equalsIgnoreCase("xena"));
        ps.println("equals: "+texto.equals("xena"));
        ps.println("Length: "+texto.length());
        ps.println("Replace: "+texto.replace('e','a'));
        ps.println("ReplaceAll: "+texto.replaceAll("Xe","ya"));
        ps.println("UpperCase: "+texto.toUpperCase());
        ps.println("LowerCase: "+texto.toLowerCase());
        ps.println("Substring: "+texto.substring(1));
        ps.println("Substring: "+texto.substring(2,texto.length()));
        String trim=("              "+texto+" princesa         ");
        ps.println("Trim: "+trim.trim());
        
    }
}
