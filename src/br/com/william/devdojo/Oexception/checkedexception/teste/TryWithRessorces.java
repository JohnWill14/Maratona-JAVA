/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.checkedexception.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class TryWithRessorces {
    public static void main(String[] args) {
        try {
            lerArquivo2();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void lerArquivo() throws FileNotFoundException{
        
            Reader reader=null;
        try {
            reader=new BufferedReader(new FileReader("Teste.txt"));
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new FileNotFoundException(ex.toString() );
        }finally{
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        }
    }
    public static void lerArquivo2() throws FileNotFoundException, IOException{
        try(Reader reader=new BufferedReader(new FileReader("Teste.txt"))) {         
        }catch(IOException ex){
            ex.printStackTrace();
            throw ex;
        } 
        
    }
}
