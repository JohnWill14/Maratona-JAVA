/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.repeticao;

import java.io.PrintStream;

/**
 *
 * @author usuario
 */
public class ImprimeAte100 {
    public static PrintStream out;
    static {
        out=System.out;
    }
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            out.println(i);
        }
    }
}
