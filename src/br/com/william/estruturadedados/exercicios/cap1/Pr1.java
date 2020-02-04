/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturadedados.exercicios.cap1;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Pr1 {
    public static void main(String[] args) {
        String str="Eu não mandarei mas Spam para meus amigos";
        int cont=0;
        int i=0;
        Random aleatorio=new Random();
        while(true){
            i++;
            int sort=(int)(Math.random()*2);
            if(sort==0)
                System.out.println(str);
            else{
                if(cont==8)continue;
                int l1=0,l2=0;
                while(l1==l2||l1>l2||str.charAt(l1)==str.charAt(l2)||str.charAt(l1)==' '||str.charAt(l2)==' '){
                    l1=(int)(Math.random()*str.length());
                    l2=(int)(Math.random()*str.length());
                    
                }
                int cont2=0;
                
//                System.out.print("*");
                for(char c:str.toCharArray()){
                    if(cont2==l1)System.out.print(str.charAt(l2));
                    else if(cont2==l2)System.out.print(str.charAt(l1));
                    else System.out.print(c);                   
                    cont2+=1;
                }
                System.out.println();
                cont+=1;
            }
            if(cont==8&&i>20)break;
        }
    }
}
