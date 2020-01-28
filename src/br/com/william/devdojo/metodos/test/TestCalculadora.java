/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.metodos.test;

import br.com.william.devdojo.metodos.classe.Calculadora;

/**
 *
 * @author usuario
 */
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora cal=new Calculadora();
        cal.plusTwoNumbers(5, 5);
        Calculadora calc=new Calculadora(2, 5);
        calc.subtraiDoisNumeros();
        double number= calc.divide(10, 0);
        System.out.println("Divisao => "+number);
        int a1=30,a2=50;
        calc.mudaNumber(a1, a2);
        System.out.println("=====================");
       
       System.out.println("a => "+a1);
       
       System.out.println("b => "+a2);
       
       System.out.println("=====================");
       
       int[] array=new int[]{
         1,2,3,4,5,6,7,8,9,10  
       };
       calc.somaArray(array);
       
       System.out.println("Varargs: "+calc.somaVarargs(1,2,3,4,5));
       System.out.println("Varargs: "+calc.somaVarargs(array));
    }
}
