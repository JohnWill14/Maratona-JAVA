/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.exercicios.cap1;

/**
 *
 * @author usuario
 */
public class Cr2 {
   public static boolean numerosDiferentes(int... varargs){
       for(int i=0;i<varargs.length-1;i++){
           for(int j=i+1;j<varargs.length;j++){
               if(varargs[i]==varargs[j])return false;
            }
       }
       return true;
   }
    public static void main(String[] args) {
        if(numerosDiferentes(1,44,2,5,6,4)){
            System.out.println("td diferente");
        }else System.out.println("a termos iguais");
        if(numerosDiferentes(1,4,2,5,5,4)){
            System.out.println("td diferente");
        }else System.out.println("a termos iguais");
        
        if(numerosDiferentes(1,44,2,5,55,4)){
            System.out.println("td diferente");
        }else System.out.println("a termos iguais");
    }
}
