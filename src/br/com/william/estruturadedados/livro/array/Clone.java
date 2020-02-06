/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.livro.array;

/**
 *
 * @author usuario
 */
public class Clone {
    public static void main(String[] args) {
        String[] nome1 = new String[]{"John William","Max Verstapen","Indiana Jones"};
        for(String i:nome1){
            System.out.println(i);
        }
        
        System.out.println("\nCopiando a referencia\n");
        
        String[] nome2=nome1;//Copiou a referencia
        nome2[1]="Tony Stark";
        for(String i:nome1){
            System.out.println(i);
        }
        
        System.out.println("\nClonando Array\n");
        
        String[] nome3=nome1.clone();//Copiou a referencia
        nome3[1]="Bruce Beyner";
        for(String i:nome1){
            System.out.println(i);
        }
        
        System.out.println("\nArray Clonado:\n");
        for(String i:nome3){
            System.out.println(i);
        }
        /*
            Caso o array seja de primitivos serão copiados os valores
        ao se utilizar "array.clone()" caso seja de tipos references
        já é outra história pq vai copiar as referencia e da no mesmo de 
        utilizar "array2=array1" :).
        */
    }
}
