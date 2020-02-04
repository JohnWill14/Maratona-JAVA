/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.arrays;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Declaracao {
    public static void main(String[] args) {
        double[] preco=new double[10];
        preco[0]=78d;
        preco[9]=6d;
        for(int i=1;i<9;i++)preco[i]=i*i;
        Arrays.sort(preco);
        for(double valor:preco)System.out.println(String.format("%.2f", valor));
        
        double preco2[]=Arrays.copyOf(preco, 20);
        System.out.println("\n===================================\n");
        for(double valor:preco2)System.out.println(String.format("%.2f", valor));
        
    }
}
