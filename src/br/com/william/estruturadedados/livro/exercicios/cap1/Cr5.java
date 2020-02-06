/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.livro.exercicios.cap1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cr5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNextLine()){
            String ola=input.nextLine();
            System.out.println(new StringBuffer(ola).reverse());
        }
    }
}
