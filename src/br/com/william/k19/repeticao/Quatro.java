/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.repeticao;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Quatro {
    public static PrintStream out;
    public static Scanner input;
    static {
        input=new Scanner(System.in);
        out=System.out;
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++)
            if(i%4==0)out.println("PI");
            else out.println(i);
        
    }
}
