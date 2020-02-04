/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.exercicios.cap1;

/**
 *
 * @author usuario
 */
public class Ex1 {
    public static void main(String[] args) {
        //int array[]=new int[5];
        //Object[] array=new Object[5];
        int[] array={1,24,56,77,8};
        int[] array2=array.clone();
        array[4]=345;
        System.out.println("Array 1");
        for(int i:array){
            System.out.println(i);
        }
        System.out.println("================\n");
        System.out.println("Array 2");
        for(int i:array2){
            System.out.println(i);
        }
    }
}
