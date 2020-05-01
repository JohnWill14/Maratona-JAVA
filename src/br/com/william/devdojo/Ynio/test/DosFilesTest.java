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
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author usuario
 */
public class DosFilesTest {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("pasta/.intllij.sql");
        if(!Files.exists(path))
            Files.createFile(path);
        
        
        DosFileAttributes dosFA=Files.readAttributes(path,DosFileAttributes.class);
        System.out.println("\tPrimeira tentativa:\n");
        Files.setAttribute(path,"dos:hidden",true);
        Files.setAttribute(path,"dos:readonly",true);
        System.out.println("hidden: "+dosFA.isHidden());
        System.out.println("Ready Only: "+dosFA.isReadOnly());
        
        System.out.println("\n\n\tSegunda tentativa\n");
        Files.setAttribute(path,"dos:hidden",false);// False desabilita a mágica
        Files.setAttribute(path,"dos:readonly",false);
        
        dosFA=Files.readAttributes(path,DosFileAttributes.class);
        System.out.println("hidden: "+dosFA.isHidden());
        System.out.println("Ready Only: "+dosFA.isReadOnly());
        
        
        System.out.println("\n\n\tTerceira tentativa\n");       
        DosFileAttributeView dosFileView=Files.getFileAttributeView(path,DosFileAttributeView.class);
        dosFileView.setHidden(true);
        dosFileView.setReadOnly(false);
        
        dosFA=Files.readAttributes(path,DosFileAttributes.class);
        System.out.println("hidden: "+dosFA.isHidden());
        System.out.println("Ready Only: "+dosFA.isReadOnly());
        
        
    }
}
