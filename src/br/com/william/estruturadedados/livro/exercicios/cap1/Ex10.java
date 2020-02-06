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
public class Ex10 {
    public static int somaN(int... vargs){
        int soma=0;
        for(int integer:vargs){
            if(vargs.length>integer){
                soma+=integer;
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        int soma=somaN(1,44,3,2,1,33);
        System.out.println(soma);
    }
}
