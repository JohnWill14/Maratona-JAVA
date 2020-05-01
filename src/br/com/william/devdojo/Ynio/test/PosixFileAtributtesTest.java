/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class PosixFileAtributtesTest {
    public static void main(String[] args) throws IOException {
       Path path=Paths.get("pasta/eclipse.html");
       if(!Files.exists(path))
        Files.createFile(path);
       PosixFileAttributes posix=Files.readAttributes(path,PosixFileAttributes.class);
       System.out.println("Permissao "+posix.permissions());
//       
//        PosixFileAttributeView posicView=Files.getFileAttributeView(path,PosixFileAttributeView.class);
//        posicView.setPermissions(set);                              usuario-grupo-outros  
        Set<PosixFilePermission> set=PosixFilePermissions.fromString("rwxrw-rw-");
        //r=>ler(read);w=>escrever(Writer);x=>executar(execute)
        Files.setPosixFilePermissions(path, set);
        
        posix=Files.readAttributes(path,PosixFileAttributes.class);
       System.out.println("Permissao "+posix.permissions());
    }
}
