/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZJOptional.test;

import java.util.Optional;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class OptionTest1 {
    private String nome;
    public static void main(String[] args) {
        OptionTest1 test1=new OptionTest1();
        Optional<String> optional1=Optional.of("DevDojo");//Required not null
        Optional<String> optional2=Optional.empty();//Option vazio
        Optional<String> optional3=Optional.ofNullable(test1.nome);//Option vazio
        //Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
//        System.out.println(test1.nome.toUpperCase());

        //Buscando valores
        System.out.println(optional1.get());
//        System.out.println(optional2.get());//Volta um erro
        System.out.println(optional2.orElse("Vazio"));//Volta um erro
        
    }
}
