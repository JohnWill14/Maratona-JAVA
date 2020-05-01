/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import br.com.william.devdojo.ZZcolections.classe.Celular;

/**
 *
 * @author usuario
 */
//equals compara conteudo do objeto
public class EqualsTest {
    public static void main(String[] args) {
        Integer i=5;
//        Integer i2=5;
        Integer i2=new Integer("5");
        if(i.equals(i2))System.out.println("numero igual");
        else System.out.println("numero diferente");
        System.out.println("\n===================\n");
        String nome1="john William";
        String nome2= new String("john William");
        if(nome1.equals(nome2))System.out.println("Iguais");
        else System.out.println("diferentes");
        System.out.println("\n===================\n");
        
        Celular iphone=new Celular();
        iphone.setNome("Iphone");
        iphone.setIME("1234");
        
        Celular iphone2=new Celular();
        iphone2.setNome("Iphone");
        iphone2.setIME("1234");
        System.out.println(iphone.equals(iphone2));
        System.out.println(iphone2.equals(iphone));
        System.out.println(iphone.equals(null));
    }
}
