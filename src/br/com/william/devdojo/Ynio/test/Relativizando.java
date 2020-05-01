/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author usuario
 */
//Relativizar vai eliminar e no Resolve ele vai juntar !
public class Relativizando {//Eliminar o que é comum nos paths
    public static void main(String[] args) {
        Path p1=Paths.get("/JohnWilliam");
        Path p2=Paths.get("/JohnWilliam/olamundo");
        //A partir de um path como chego no outro
        System.out.println(p1.relativize(p2));
        
        Path absoluto1=Paths.get("/home/johnWilliam");
        Path absoluto2=Paths.get("/usr/local");
        Path absoluto3=Paths.get("/home/johnwilliam/ehissodai.class");
        Path relativo1=Paths.get("temp");
        Path relativo2=Paths.get("temp/Funcionario.class");
        
        //Path.relativize(path2);
        //Como saio de path para chegar em path2
        System.out.println("1- "+absoluto1.relativize(absoluto3));
        System.out.println("2- "+absoluto3.relativize(absoluto1));
        System.out.println("3- "+absoluto1.relativize(absoluto2));
        System.out.println("4- "+relativo1.relativize(relativo2));
       try{
            System.out.println("5- "+absoluto1.relativize(relativo2));
       }catch(Exception ex){
         throw  new RuntimeException("\n\nO java não sabe fazer um \n"
                   + "caminho absoluto chegar em um caminho relativo. \n\n"+ex);
       }
    }
}
