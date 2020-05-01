/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Wio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class BufferedTest {
    public static void main(String[] args) {
        File file=new File("Arquivo.txt");
        
//        FileWriter fw=new FileWriter(file,false);
//        BufferedWriter bw=new BufferedWriter(fw);
//        FileReader fr=new FileReader(file);
//        BufferedReader br=new BufferedReader(fr);
//           
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,false));
            BufferedReader br=new BufferedReader(new FileReader(file));){
           
            
            
            bw.write("Ola! Viva a vida !!");
            bw.newLine();
            bw.write("É isso aí");
            
            bw.append("\nOla! Viva a vida !");
            bw.flush();
            
            
            
            String s=null;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
