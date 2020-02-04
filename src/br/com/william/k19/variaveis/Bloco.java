/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.variaveis;

/**
 *
 * @author usuario
 */
public class Bloco {
   
    public static void main(String[] args) {
        int num=10;
         {
             int num1=30;
            System.out.println("num =>"+num);
            System.out.println("num1 =>"+num1);
         }
         {
            int num1=25;
            System.out.println("num1 =>"+num1);
         }
    }
}
