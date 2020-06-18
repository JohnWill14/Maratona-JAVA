/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZIdefault.interfaces;

import java.util.List;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 * @param <T>
 */
public interface MyList<E> {
    static void sort(){
        System.out.println("Dentro do sort");
    }
    default void add(List<E> lista,E object){
        lista.add(object);
        
    }
}
