/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import jdk.internal.org.objectweb.asm.tree.analysis.SimpleVerifier;

/**
 *
 * @author usuario
 */
public class FileVisitorTest {
    private static class AcharTodosOsTxt extends SimpleFileVisitor<Path>{

        @Override
        public FileVisitResult visitFile(Path t, BasicFileAttributes bfa){
            if(t.getFileName().toString().endsWith(".txt")){
                System.out.println(t.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
        
    }
    public static void main(String[] args) throws IOException {
//        Files.walkFileTree(Paths.get("pasta"), new SimpleFileVisitor<Path>(){
//            @Override
//            public FileVisitResult visitFile(Path t, BasicFileAttributes bfa) throws IOException {
//                return super.visitFile(t, bfa); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        });
        Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsTxt());
        System.out.println("****************");
        Files.walkFileTree(Paths.get("pasta"),new PrintDirs() );
        
        
    }
    public static class PrintDirs extends SimpleFileVisitor<Path>{

        @Override
        public FileVisitResult preVisitDirectory(Path t, BasicFileAttributes bfa) throws IOException {
            System.out.println("Dir: "+t);
            return FileVisitResult.CONTINUE;
        }
        
        @Override
        public FileVisitResult visitFile(Path t, BasicFileAttributes bfa) throws IOException {
            System.out.println("file: "+t);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path t, IOException ioe) throws IOException {
            System.out.println("file failed: "+t);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path t, IOException ioe) throws IOException {
            System.out.println("Pos dir: "+t);
            return FileVisitResult.CONTINUE;
        }
        
    }
}
