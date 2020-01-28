/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.array;

/**
 *
 * @author usuario
 */
public class Inicializa {
    public static void main(String[] args) {
        
        System.out.println("Inicializazao de Arrays\n\n");
        
        System.out.println("Array de primitivos:");
        int[] vet=new int[5];
        for(int i=0;i<vet.length;i++){
            System.out.println(i+" => "+vet[i]);
        }
        
        System.out.println("\nArray de Objeto:");
        
        String[] strVet=new String[5];
        int cont=0;
        for(String i:strVet){
            cont++;
            System.out.println(cont+" => "+i);
        }
    }
}
