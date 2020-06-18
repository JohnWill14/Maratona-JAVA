/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZIdefault.interfaces;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public interface B extends A{
    
    @Override
    default void pedirDitadura(){
        System.out.println("Ditadura Já em B!");
    }
}
