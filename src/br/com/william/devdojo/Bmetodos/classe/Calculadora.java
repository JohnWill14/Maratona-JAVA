/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Bmetodos.classe;

/**
 *
 * @author usuario
 */
public class Calculadora {
   private static double a;
   private static double b;
   public Calculadora(){
       super();
   }
   public Calculadora(double number1,double number2){
       a=number1;
       b=number2;
   }
    public static void plusTwoNumbers(int a,int b){
       System.out.println(a+b);
   }
   public static void subtraiDoisNumeros(){
       System.out.println(String.format("%.0f", b-a));
   }
   public double divide(double a,double b){
       if(b!=0)return a/b;
       return 0;
   }
   public void mudaNumber(int a,int b){
       a=42;
       b=24;
       System.out.println("=====================");
       
       System.out.println("a => "+a);
       
       System.out.println("b => "+b);
       
       System.out.println("=====================");
   }
   public void somaArray(int[] array){
       int soma=0;
       for(int i:array){
           soma+=i;
       }
       System.out.println("Soma Array => "+soma);
   }
   public int somaVarargs(int... numeros){
       int soma=0;
       for(int i:numeros){
           soma+=i;
       }
       return soma;
   }
}
