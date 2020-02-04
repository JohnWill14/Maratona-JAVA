/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.operadores;

/**
 *
 * @author usuario
 */
public class Aritmeticos {
    public static void main(String[] args) {
        int soma=1+4;
        int subtracao=1-5;
        long multiplicacao=3L*7L;
        double divisao=3/7d;
        int resto = 5%4;
        System.out.println("Soma => (1+4) ="+soma);
        System.out.println("Subtracao => (1-5) = " +subtracao);
        System.out.println("Multiplicacao => (3*7) ="+multiplicacao);
        System.out.println("Divisao => (3/7) = "+String.format("%.2f",divisao));
        System.out.println("Resto => (5%4) = "+resto);
    }
}
