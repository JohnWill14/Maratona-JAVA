/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZKstreams.test;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest5GerandoStreams {
    public static void main(String[] args) {
        IntStream.range(1, 100)//(a,n) vai de a até n-1
                .filter(i->i%2==0)
                .forEach(i-> System.out.print(i+" "));
        System.out.println();
        IntStream.rangeClosed(1, 100)//(a,n) vai de a até n
                .filter(i->i%2==0)
                .forEach(i-> System.out.print(i+" "));
        System.out.println();
        
        Stream<String> of = Stream.of("John", "DevDojo", "ooohhhhh");
        of.map(String::toUpperCase)
          .collect(Collectors.toList())
          .forEach(System.out::println);
        System.out.println();
        try(Stream<String> lines=Files.lines(Paths.get("Teste.txt"), Charset.defaultCharset())){
            lines.flatMap(line->Arrays.stream(line.split("\n")))
                 .filter(s->s.contains("b")||s.contains("B"))
                 .forEach(s->System.out.print(s+" "));
                 
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("");
        
        Stream.iterate(1, n->n+2)
                .limit(10)
               .forEach(System.out::println);
        System.out.println("");
        
        Stream.iterate(new int[]{0,1}, n-> new int[]{n[1],n[0]+n[1]} )
                .limit(40)
                .map(n->n[0])
               .forEach(n->System.out.print(n+" "));
        
        System.out.println("");
        Stream.generate(Math::random).limit(10).forEach(s->System.out.println(s+" "));
    }
}
