/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author usuario
 */
public class PathMatcherTest {
    public static void main(String[] args) throws IOException {
        Path path1=Paths.get("pasta/file.txt");
        Path path2=Paths.get("eclipse.txt");
        Path path3=Paths.get("john-william");
        
        PathMatcher matcher= FileSystems.getDefault().getPathMatcher("glob:*.txt");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
//        Files.walkFileTree(path1, new AcharTodosOsTXTs());

        System.out.println("--------------------------------\n\n");
        matches(path1,"glob:*.txt");//Desconsidera diretório    
        matches(path1,"glob:**.txt");//Conscidera qualquer coisa
        matches(path1,"glob:*");//Ele não considera diretórios
        matches(path1,"glob:**");//Qualquer coisa
        
        System.out.println("--------------------------------\n\n");
        
        matches(path1, "glob:*.???");//depois do ponto três letters
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**.???");
        
        System.out.println("--------------------------------\n\n");
        
        matches(path3, "glob:{john*,william*}");//Captura john ou william
        matches(path3, "glob:{john,william}*");//Captura john ou william
        matches(path3, "glob:{john,william}");//Csptura apenas john ou william
        
        Path projeto=Paths.get("src","br","com","william","devdojo");
        Path projeto2=Paths.get("");
        
        System.out.println("--------------------------------\n\n");
        Files.walkFileTree(projeto, new FindAllTest());
        System.out.println("--------------------------------\n\n");
        Files.walkFileTree(projeto2, new FindAllTest());
    }
    public static void matches(Path p,String glob){
        PathMatcher matcher=FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+" "+matcher.matches(p));
    }
    
    public static class FindAllTest extends SimpleFileVisitor<Path>{

        @Override
        public FileVisitResult visitFile(Path t, BasicFileAttributes bfa) throws IOException {
           String glob="glob:**/*{Test*}.{txt,java,class}";
            PathMatcher matcher=FileSystems.getDefault().getPathMatcher(glob);
            if(matcher.matches(t)){
                System.out.println(""+t.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
        
    }
}
