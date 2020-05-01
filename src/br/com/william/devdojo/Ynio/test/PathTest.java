/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class PathTest {
    public static void main(String[] args)  {
        
            //Path é uma interface
            Path path=Paths.get("/home/usuario/Documentos/NetBeansProjects/Maratona/Teste.txt");
            Path path2=Paths.get("/home/usuario/Documentos","NetBeansProjects/Maratona","Teste.txt");//Não se preocupe com as /
            System.out.println(path2.toAbsolutePath());
            
            File file=path.toFile();
            path=file.toPath();
            
            Path dir=Paths.get("pasta/subpasta/subsubpasta");
            Path files=Paths.get("pasta/subpasta/subsubpasta/file.txt");
            
        try {
           if(!Files.notExists(dir)) Files.deleteIfExists(dir);
//           Files.createDirectory(dir);//Cria uma fouder
//            Files.createDirectories(dir);//Cria vários Fouders '/'
//            Files.createFile(path);
//            Files.createDirectories(files.getParent());//Carrega todos diretorios excluindo arquivos
       // Files.createFile(files);
//       Files.createDirectories(files);
        if(Files.notExists(files)){
            Files.createDirectories(files.getParent());
            Files.createFile(files);
        }
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        Path sorce=Paths.get(files.toUri());
        Path target=Paths.get("pasta/file.txt");
        try {
            Files.copy(sorce, target);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
