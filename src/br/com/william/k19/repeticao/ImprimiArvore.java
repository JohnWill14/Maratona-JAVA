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
public class ImprimiArvore {
    public static PrintStream out;
    public static Scanner input;
    static {
        input=new Scanner(System.in);
        out=System.out;
    }
    public static void main(String[] args) {
        while(input.hasNextInt()){
           // out.println("Insira o valor da base:");
            int num=input.nextInt();
            int esp=num;
            int aux=num;
            for(int estrela=1;estrela<=num;estrela++ ){
                espaco(esp);
                esp--;
                estrelas(estrela*2-1);
                out.println();
                
            }
            espaco(aux--);
            out.println("*");
            espaco(aux);
            out.println("***");
        }
    }
    public static void espaco(int n){
        while(n-- >0){
            out.print(" ");
        }
    }
    public static void estrelas(int n){
        while(n-- >0){
            out.print("*");
        }
    }
}
