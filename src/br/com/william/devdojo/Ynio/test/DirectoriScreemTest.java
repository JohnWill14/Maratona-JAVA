/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class DirectoriScreemTest {
    public static void main(String[] args) {
        Path path=Paths.get("pasta");
        //Stream conjunto de bits em um canal
        try(DirectoryStream<Path> dirStream=Files.newDirectoryStream(path);){
            for(Path p:dirStream){
                System.out.println(p.getFileName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
