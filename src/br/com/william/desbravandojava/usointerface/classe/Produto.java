/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.usointerface.classe;

/**
 *
 * @author usuario
 */
//Quando a onterface possui apenas um metodo abstrato ele
// he chamada de interface funcional xará
@FunctionalInterface
public interface Produto {
    
    public abstract double getValor();

   
   
}
