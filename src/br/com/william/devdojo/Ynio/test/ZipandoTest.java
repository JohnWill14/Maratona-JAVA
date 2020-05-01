/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.BufferedInputStream;
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
public class ZipandoTest {
    public static void main(String[] args) {
        Path dirZip=Paths.get("pasta");
        Path dirFiles=Paths.get("src/");
        Path zipFile=dirZip.resolve("arquivo.zip");
        
        try(ZipOutputStream zip=new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
                DirectoryStream<Path> stream=Files.newDirectoryStream(dirFiles)){
            for(Path p:stream){
                if(Files.isDirectory(p)||p.getFileName().toString().endsWith(".zip"))continue;
    
                ZipEntry zipEntry=new ZipEntry(p.getFileName().toString());
                zip.putNextEntry(zipEntry);
                FileInputStream fileIputSteam=new FileInputStream(p.toFile());
                BufferedInputStream bis=new BufferedInputStream(fileIputSteam);
                byte[] buff=new byte[2048];
                
                int leitura;
                while((leitura=fileIputSteam.read(buff)) >0){
                    zip.write(buff,0,leitura);
                }
                zip.flush();
                zip.closeEntry();
                fileIputSteam.close();
                System.out.println(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZipandoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ZipandoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
