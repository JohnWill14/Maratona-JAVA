/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.test;

import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.Aviao;
import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.AviaoSingleton;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class AviaoSingletonTest {
     public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }
    private static void agendarAssento(String assento){
        AviaoSingleton a=AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento)?"Agendou":"Não foi possivel agendar");
    }
}
