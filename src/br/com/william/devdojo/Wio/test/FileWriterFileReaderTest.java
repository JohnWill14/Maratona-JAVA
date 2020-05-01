package br.com.william.devdojo.Wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
public class FileWriterFileReaderTest {
     public static void main(String[] args) {
        File file=new File("Arquivo.txt");
         writeFale(file);
         readerFile(file);
    }
     public static void writeFale(File file){
        try(FileWriter fw=new FileWriter(file,false);){//false deixa adicionar conteudo e não limpa o arquivo td
             fw.write("Ola mundo !!!\n");//Limpa e escreve no arquivo
             fw.append("\nEscrevendo uma msg para mim msm, eh ta feio");//Adiciona ao fim do texto
             fw.flush();
        } catch (IOException ex) {
             ex.printStackTrace();
         }
     }
     public static void readerFile(File file){
         try(FileReader fr=new FileReader(file);){
             int size;
             char[] array=new char[500];
             size=fr.read(array);
             System.out.println("Tamanho: "+size);
             for(char c:array){
                 System.out.print(c);
             }
             System.out.println();
             
         }catch(IOException ex){
             ex.printStackTrace();
         }
     }
}
