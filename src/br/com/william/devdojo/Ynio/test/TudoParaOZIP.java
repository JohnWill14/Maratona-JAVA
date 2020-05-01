/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author usuario
 */
public class TudoParaOZIP {
    private static void comprimi(){
        Path dirzip=Paths.get("pasta");
        Path comprimindo=Paths.get("src");
        Path file=dirzip.resolve("teste.zip");
        
        try(ZipOutputStream zip=new ZipOutputStream(new FileOutputStream(file.toFile()))){
            
            zipando(zip,comprimindo);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TudoParaOZIP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TudoParaOZIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private static void zipando(ZipOutputStream zip,Path path){
        try(DirectoryStream<Path> ds=Files.newDirectoryStream(path)){
            
            for(Path pat:ds){
                if(Files.isDirectory(pat)){
                    zipando(zip, pat);
                }
                else{
//                    System.out.println("file: "+pat);
                    ZipEntry zipEntry=new ZipEntry(pat.toString());
                    FileInputStream fis=new FileInputStream(pat.toFile());
                    zip.putNextEntry(zipEntry);
                    byte[] buff=new byte[2048];
                    int leitura;
                    while((leitura=fis.read(buff))>0){
                        zip.write(buff, 0, leitura);
                    }
                    zip.flush();
                    zip.closeEntry();
                    fis.close();
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TudoParaOZIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        comprimi();
    }
}
