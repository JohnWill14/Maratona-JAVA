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
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class AtributosBasic {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro=new GregorianCalendar(2019, Calendar.DECEMBER, 1).getTime();
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        File file=new File("pasta/olamundo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(df.format(file.lastModified()));
        file.delete();
        Path olamundoPath=Paths.get("pasta","olamundoPath.txt");
        Files.deleteIfExists(olamundoPath);
        Files.createFile(olamundoPath);
        Files.setLastModifiedTime(olamundoPath, FileTime.fromMillis(primeiroDeDezembro.getTime()));
        System.out.println(olamundoPath);
        System.out.println("Path-> "+df.format(Files.getLastModifiedTime(olamundoPath).toMillis()));
        System.out.println("Path-> "+Files.getLastModifiedTime(olamundoPath));
//        Files.delete(olamundoPath);
        
//Atributos basicos
        Path classe=Paths.get("/home/usuario/Documentos/NetBeansProjects/Maratona/src/br/com/william/devdojo/Aclasses/test/TestCarro.java");
        System.out.println("Test Classes: "+Files.getLastModifiedTime(classe));
        System.out.println("Leitura: "+Files.isReadable(classe));
        System.out.println("Escrita: "+Files.isWritable(classe));
        System.out.println("Executa: "+Files.isExecutable(classe));
        
        System.out.println("\n\nInterfaces Basics\n\n");
        //BasicFileAttributes, PosixFileAttributes and DosFileAtributes
        //Generic              UNI                     WINDOWS
        //Leitura
        
        BasicFileAttributes atributosBasicos= Files.readAttributes(classe,BasicFileAttributes.class);
        System.out.println("criação "+atributosBasicos.creationTime());
        System.out.println("Ultima modificaçao "+atributosBasicos.lastModifiedTime());
        System.out.println("Ultimo acesso "+atributosBasicos.lastAccessTime());
        System.out.println("É um diretorio ! "+atributosBasicos.isDirectory());
    
        //BasicFileAttributeView, PosixFileAttributeView, DosFileAtributeView, FileOwenerAttributeView and AclFileAttributeView
        //Generic              UNI                       WINDOWS               setar dono                  avançado
        //Alterações
        BasicFileAttributeView bav=Files.getFileAttributeView(classe, BasicFileAttributeView.class);
        FileTime lastModify=atributosBasicos.lastModifiedTime();
        FileTime created=atributosBasicos.creationTime();
        FileTime lastAcess=FileTime.fromMillis(System.currentTimeMillis());//Data agora
        atributosBasicos= Files.readAttributes(classe,BasicFileAttributes.class);
        bav.setTimes(lastModify,lastAcess,created);
        System.out.println("Ultimo acesso "+atributosBasicos.lastAccessTime());
        
    
    }   
        
}
