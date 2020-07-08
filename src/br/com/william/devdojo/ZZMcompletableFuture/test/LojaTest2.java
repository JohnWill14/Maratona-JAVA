/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.test;

import br.com.william.devdojo.ZZMcompletableFuture.classe.Loja;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LojaTest2 {
    public static void main(String[] args) {
        List<Loja> lojas= Arrays.asList(
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("best buy"),
                new Loja("wallmart"));
    
//        System.out.println(acharPreco(lojas)+"\n");
        System.out.println(acharPreco2(lojas)+"\n");
        System.out.println(acharPreco3(lojas)+"\n");
        System.out.println(acharPreco4(lojas)+"\n");
    }
    
    private static List<String> acharPreco(List<Loja> lojas){
        System.out.println("Stream sequencial ");
        long start=System.currentTimeMillis();
        
        List<String> collect = lojas.stream()
                .map(j-> j.getNome()+" "+String.format("%.2f", j.getPreco()))
                .collect(Collectors.toList());
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo: "+(end-start)+" ms");
         return collect;
    }
    private static List<String> acharPreco2(List<Loja> lojas){
        System.out.println("Stream paralelo ");
        long start=System.currentTimeMillis();
        
        List<String> collect = lojas.stream()
                .parallel()
                .map(j-> j.getNome()+" "+String.format("%.2f", j.getPreco()))
                .collect(Collectors.toList());
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo: "+(end-start)+" ms");
         return collect;
    }
    private static List<String> acharPreco3(List<Loja> lojas){
        System.out.println("CompletableFuture sequencial ");
        long start=System.currentTimeMillis();
        
        
        List<String> collect = lojas.stream()
                .map(j-> CompletableFuture.supplyAsync(
                        ()-> j.getNome()+" "+String.format("%.2f", j.getPreco())
                ))
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo de invocação: "+(end-start)+" ms");
         return collect;
    }
    private static List<String> acharPreco4(List<Loja> lojas){
        System.out.println("CompletableFuture sequencial quebrado");
        long start=System.currentTimeMillis();
        
        
        List<CompletableFuture<String>> collect = lojas.stream()
                
                .map(j-> CompletableFuture.supplyAsync(
                        ()-> j.getNome()+" "+String.format("%.2f", j.getPreco())
                ))
                .collect(Collectors.toList());
        
        long end=System.currentTimeMillis();
        System.out.println("Tempo de invocação: "+(end-start)+" ms");
        
        List<String> collect1 = collect.stream().map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println("Tempo de calculo: "+(System.currentTimeMillis()-start)+" ms");
         return collect1;
    }
}
