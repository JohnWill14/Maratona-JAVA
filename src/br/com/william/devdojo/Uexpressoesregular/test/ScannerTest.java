/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Uexpressoesregular.test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author usuario
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner("Hellow Word !");
//        sc.useDelimiter()
        sc.useDelimiter("\\s");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        System.out.println("\n===========================\n");
        
        Scanner sc2=new Scanner("1 true 100 oi");
        while(sc2.hasNext()){
            if(sc2.hasNextInt()){
                Integer numero=sc2.nextInt();
                System.out.println("numero: "+numero);
            }else if(sc2.hasNextBoolean()){
                Boolean bool=sc2.nextBoolean();
                System.out.println("bool: "+bool);
            }else if(sc2.hasNext()){
                String str=sc2.next();
                System.out.println("String: "+str);
            }
        }
    }
}
