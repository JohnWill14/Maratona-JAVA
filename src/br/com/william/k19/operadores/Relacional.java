/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.operadores;
import java.io.PrintStream;
/**
 *
 * @author usuario
 */
public class Relacional {
    static public PrintStream out;
    static {
        Relacional.out=System.out;
    }
    public static void main(String[] args) {
        boolean test1=14<15;
        boolean test2=13>=10;
        boolean test3=3.4>33;
        boolean test4=56>=7;
        
        out.println("1 => "+test1);
       
        out.println("2 => "+test2);
        
        out.println("3 => "+test3);
        
        out.println("4 => "+test4);
        
    }
}
