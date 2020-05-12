/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.test;

/**
 *
 * @author usuario
 */
public class ClassTest {
    private ListaAnimal<Cachorro> lista;
    private ListaAnimal<Gato> lista2;
    private ListaAnimal<Gato> lista3;
    private ListaCachorro<Cachorro> lista4;
//    private ListaCachorro<Gato> lista5;//is not within bounds of type-variable T
    public static void main(String[] args) {
        new ClassTest();
    }
}

class ListaAnimal<T extends Animal>{
    
}

class ListaCachorro<T extends Cachorro>{
    
}
