/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.classe;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class AviaoSingleton {
    //EAGER INITIALZATION
//    private static final AviaoSingleton INSTANCE=new AviaoSingleton();
    private static  AviaoSingleton INSTANCE;
    private Set<String> assentosDisponiveis;
    
    private AviaoSingleton(){
        this.assentosDisponiveis=new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public static AviaoSingleton getINSTANCE() {
        //LAZY initialization
        if(INSTANCE==null){
            synchronized(AviaoSingleton.class){
                if(INSTANCE==null)
                    INSTANCE=new AviaoSingleton();
            }
        }
        return INSTANCE;
    }
    
    public boolean bookAssento(String assento){
        return this.assentosDisponiveis.remove(assento);
    }
    
}
