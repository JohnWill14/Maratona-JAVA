/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZLstreamsParalelos.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamsParalelos1 {
    public static void main(String[] args) {
        long num=10_000_000_000L;
        System.out.println(Runtime.getRuntime().availableProcessors()+" numero de processadores\n");
        sumFor(num);
//        System.out.println();
//        sumStream(num);
        System.out.println();
        sumStreamLong(num);
//        System.out.println();
//        sumStreamParalelo(num);
        System.out.println();
        sumStreamParaleloLong(num);
        
    }
    private static void sumFor(long num){
        System.out.println("Dentro do for");
        long result=0;
        
        long init=System.currentTimeMillis();
        for(long i=1L;i<=num;i++){
            result+=i;
        }
        long fim=System.currentTimeMillis();
        long temp=fim-init;
        System.out.println("A soma he de "+result+".O tempo de execução he de "+temp+" milisegundos");
    }
    private static void sumStream(long num){
        System.out.println("Dentro do Stream Sequencial");
        long result=0;
        
        long init=System.currentTimeMillis();
        
        result= Stream.iterate(1L, i->i+1).limit(num).reduce(0L, Long::sum);
        
        long fim=System.currentTimeMillis();
        long temp=fim-init;
        System.out.println("A soma he de "+result+".O tempo de execução he de "+temp+" milisegundos");
    }
    private static void sumStreamLong(long num){
        System.out.println("Dentro do LongStream Sequencial");
        long result=0;
        
        long init=System.currentTimeMillis();
        
        result= LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        
        long fim=System.currentTimeMillis();
        long temp=fim-init;
        System.out.println("A soma he de "+result+".O tempo de execução he de "+temp+" milisegundos");
    }
    
     private static void sumStreamParalelo(long num){
        System.out.println("Dentro do Stream Paralelo");
        long result=0;
        
        long init=System.currentTimeMillis();
        
        result= Stream.iterate(1L, i->i+1).parallel().limit(num).reduce(0L, Long::sum);
        
        long fim=System.currentTimeMillis();
        long temp=fim-init;
        System.out.println("A soma he de "+result+".O tempo de execução he de "+temp+" milisegundos");
    }
     private static void sumStreamParaleloLong(long num){
        System.out.println("Dentro do LongStream Paralelo");
        long result=0;
        
        long init=System.currentTimeMillis();
        
        result= LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        
        long fim=System.currentTimeMillis();
        long temp=fim-init;
        System.out.println("A soma he de "+result+".O tempo de execução he de "+temp+" milisegundos");
    }
}
