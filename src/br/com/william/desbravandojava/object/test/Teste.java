/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.object.test;

import br.com.william.desbravandojava.object.classe.Pessoa;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa p=new Pessoa("john william", 2.03, "222.654.098-56");
        Pessoa p2=new Pessoa("john william", 2.03, "222.654.098-56");
       // Pessoa john=(Pessoa)"john"; Nao dá certo
        System.out.println(p);
        if(p.equals(p2)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        if(p.equals("joghn")){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        System.out.println(p.getClass().getSimpleName());
        Random r=new Random();
        System.out.println(r.nextInt(100));
        String nome="John";
        String nome2="John";
        if(nome==nome2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
