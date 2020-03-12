package br.com.william.devdojo.Oexception.checkedexception.teste;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class TestCheckedException {
    public static void main(String[] args) {
        try {
            criarArquivo("Teste");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static void criarArquivo(String nome) throws IOException{
        File f=new File(nome+".txt");
        try{
            f.createNewFile();
        }catch(IOException ex){
            ex.printStackTrace();
            throw ex;//  Lança ex
        } finally{
            System.out.println("Executei no final....");
        }
    }
}
