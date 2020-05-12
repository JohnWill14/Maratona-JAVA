/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZBClassesInternas.test;

/**
 *
 * @author usuario
 */
class ClasseExterna{
    public static String nome="Ola mundo";
    static class interna{//Membro da classe, mas não uma classe
        public void print(){
            System.out.println(nome);
            System.out.println("oi");
        }
    }
}
public class ClasseInternaTest {
    public static void main(String[] args) {
     ClasseExterna.interna testIn=new ClasseExterna.interna();
     testIn.print();
     
     Interna2 i2=new Interna2();
     i2.print();
     
     
     
    }
    static class Interna2{
       
        public  void print(){
            System.out.println("EOOOEEEO Vida de gado povo marcado he povo feliz!!!");
        }
    }
}
