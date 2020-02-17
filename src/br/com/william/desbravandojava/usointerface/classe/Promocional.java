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
// he chamada de interface funcional meu Xará _ Logan .......
@FunctionalInterface
public interface Promocional {
    public abstract boolean aplicaDescontoDe(double desconto);
    default boolean aplicaDescontoDe10(){
        return aplicaDescontoDe(10);
    }
}
