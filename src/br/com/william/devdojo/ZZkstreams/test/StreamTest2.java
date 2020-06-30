/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List< List<String>> nomes= new ArrayList<>();
        
        nomes.add(Arrays.asList("John","Sabrina"));
        nomes.add(Arrays.asList("DevDojo","William"));
        nomes.add(Arrays.asList("sum(1,19)","190"));
        nomes.stream()
             .flatMap(Collection::stream)
             .collect(Collectors.toList())
             .forEach(System.out::println);
        System.out.println(nomes);
        
        List<String> palavras=Arrays.asList("Ola","Goku");
        palavras.stream()
                .map(p->p.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        List<List<String>> nomesDoJohn=new ArrayList<>();
        nomesDoJohn.add(Arrays.asList("John William","Getúlio"));
        nomesDoJohn.add(Arrays.asList("William","DevDojo"));
        nomesDoJohn.add(Arrays.asList("Diogo","Hello world"));
        
//        Stream<List<String>> stream = nomesDoJohn.stream();
//        Stream<String> flatMap = nomesDoJohn.stream()
//                .flatMap(Collection::stream);
        nomesDoJohn.stream()
                .flatMap(Collection::stream)
                .map(p->p.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
