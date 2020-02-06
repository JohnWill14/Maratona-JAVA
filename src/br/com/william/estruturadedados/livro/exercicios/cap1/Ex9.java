/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.livro.exercicios.cap1;

/**
 *
 * @author usuario
 */
public class Ex9 {
    public static boolean isOdd(int number){
        int i=0;
        while(i<=number){
            if(i==number)return true;
            i+=2;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(0));
        System.out.println(isOdd(21));
        System.out.println(isOdd(31));
        System.out.println(isOdd(30));
    }
}
