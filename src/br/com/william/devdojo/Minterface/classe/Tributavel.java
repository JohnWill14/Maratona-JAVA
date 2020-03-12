/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Minterface.classe;

/**
 *
 * @author usuario
 */
public interface Tributavel {
   // public  static final double IMPOSTO=0.2d; public static final fica a sua imaginacao
   double IMPOSTO=0.2d;
    void calculaImposto();
    default void imprime(){
        System.out.println("Hellow Word");
    }
    
}
