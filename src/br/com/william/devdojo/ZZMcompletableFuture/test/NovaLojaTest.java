/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.test;

import br.com.william.devdojo.ZZMcompletableFuture.classe.Desconto;
import br.com.william.devdojo.ZZMcompletableFuture.classe.Loja;
import br.com.william.devdojo.ZZMcompletableFuture.classe.NovaLoja;
import br.com.william.devdojo.ZZMcompletableFuture.classe.Orcamento;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class NovaLojaTest {
    public static void main(String[] args) {
        List<NovaLoja> lojas= getLojas();
        
//        lojas.stream().forEach(nova->System.out.println(nova.getPreco()));
        
//        acharPreco(lojas).stream()
//                .forEach(s->System.out.println(s));
//        
        final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });
        
//        acharPrecoAsync(lojas, executor).forEach(s->System.out.print(s+"\n"));

        long start=System.currentTimeMillis();
        CompletableFuture[] toArray = acharPrecoStream(lojas, executor)
                .map(f->f.thenAccept(s->System.out.println(s+" executado em: ( "+
                        (System.currentTimeMillis() -start)+" ms )")))
                .toArray(CompletableFuture[]::new); 
        CompletableFuture.allOf(toArray).join();
        
        
    }
    
    public static List<NovaLoja> getLojas(){
        List<NovaLoja> lojas= Arrays.asList(new NovaLoja("Americanas"),
                new NovaLoja("Casas Bahia"),
                new NovaLoja("best buy"),
                new NovaLoja("Americanas"),
                new NovaLoja("Casas Bahia"),
                new NovaLoja("best buy"));
        return lojas;
    }
    
     private static List<String> acharPreco(List<NovaLoja> lojas){
        System.out.println("Stream sequencial ");
        long start=System.currentTimeMillis();
        
        List<String> collect = lojas.stream()
                .map(NovaLoja::getPreco)
                .map(Orcamento::parse)
                .map(Desconto.Codigo::CalcularDesconto)
                .collect(Collectors.toList());
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo: "+(end-start)+" ms");
         return collect ;
    }
     private static List<String> acharPrecoAsync(List<NovaLoja> lojas, Executor executor){
        System.out.println("Completable Future Async ");
        long start=System.currentTimeMillis();
        
        List<CompletableFuture<String>> collect = lojas.stream()
                .map(loja->CompletableFuture.supplyAsync(loja::getPreco, executor   ))
                .map(future-> future.thenApply(Orcamento::parse))
                .map(future->future.thenCompose(orcamento->
                        CompletableFuture.supplyAsync(()->Desconto.Codigo.CalcularDesconto(orcamento), executor)))
                .collect(Collectors.toList());
        List<String> collect1 = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo: "+(end-start)+" ms");
         return collect1 ;
    }
     private static  Stream<CompletableFuture<String>> acharPrecoStream(List<NovaLoja> lojas, Executor executor){
        System.out.println("Completable Future Async Stream");
        long start=System.currentTimeMillis();
        
        Stream<CompletableFuture<String>> map = lojas.stream()
                .map(loja->CompletableFuture.supplyAsync(loja::getPreco, executor   ))
                .map(future-> future.thenApply(Orcamento::parse))
                .map(future->future.thenCompose(orcamento->
                        CompletableFuture.supplyAsync(()->Desconto.Codigo.CalcularDesconto(orcamento), executor)));
        long end=System.currentTimeMillis();
        
        System.out.println("Tempo: "+(end-start)+" ms");
         return map ;
    }
}
