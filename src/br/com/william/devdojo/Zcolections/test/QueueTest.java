/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Produto;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author usuario
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> fila=new PriorityQueue<>();
        fila.add("C");
        fila.add("D");
        fila.add("B");
        fila.add("A");
        System.out.println(fila);
        System.out.println(fila.remove());
        System.out.println("Empty: "+fila.isEmpty());
        System.out.println("Offer: "+fila.offer("E"));;//Adiciona se der errado devolve um boolean
        System.out.println(fila.peek());//Devolve o first e não remove
        System.out.println(fila.poll());//Devolve e exlui
        
    }
}
