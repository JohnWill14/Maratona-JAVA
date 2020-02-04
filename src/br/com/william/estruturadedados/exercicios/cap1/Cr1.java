/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.exercicios.cap1;

import sun.rmi.transport.DGCAckHandler;

/**
 *
 * @author usuario
 */
public class Cr1 {
    public static int[] recebeArray(int[] array ){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(i!=j){
                    int m=array[i]*array[j];
                    if(isOdd(m)){
                       System.out.println("["+i+"]:"+array[i]+"\t["+
                               j+"]:"+array[j]);
                    }
                }
            }
        }
        return null;
    } 
    public static boolean isOdd(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        int[] array=new int[]{
          1,22,3,44,11,33,13  
        };
        recebeArray(array);
    }
}
