/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class FileDiretorioTest {
    public static int id=0;
    public static void main(String[] args) {
        try {
            criaDiretorio();
            buscaFiles("", new File("src"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void busca(){
        File arquivo=new File("src/");
        String[] strs= arquivo.list();
        for(String s:strs){
            System.out.println(s);
        }
    }
    public static void buscaFiles(String str,File sorce){
        String[] strs=sorce.list();
        File[] files=sorce.listFiles();
        if(files==null)return;
        for(int i=0;i<strs.length;i++){
            if(!files[i].isDirectory()){
                System.out.println(id+"- "+str+strs[i]);
                id+=1;
            }
            buscaFiles(str+strs[i]+"/",files[i] );
        }
        
    }
    public static void criaDiretorio() throws IOException{
        File arquivo=new File("diretorio");
        boolean diretorioCriado=arquivo.mkdir();
        if(!diretorioCriado){
            arquivo.delete();
            diretorioCriado=arquivo.mkdir();
        }
        File texto=new File(arquivo,"Texto.txt");
        texto.createNewFile();
        File novoArquivo=new File(arquivo,"ArquivoRenomeado");
        texto.renameTo(novoArquivo);
        System.out.println("Criando diretorio: "+diretorioCriado);
        
        
    }
}
