/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.test;

import br.com.william.devdojo.ZZMcompletableFuture.classe.Loja;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.LongStream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LojaTest {
    public static void main(String[] args) {
        Loja loja=new Loja();
        Loja loja1=new Loja();
        Loja loja2=new Loja();
        Loja loja3=new Loja();
        long start, end;
//         start=System.currentTimeMillis();
//        System.out.println(loja.getPreco());
//        System.out.println(loja1.getPreco());
//        System.out.println(loja2.getPreco());
//        System.out.println(loja3.getPreco());
//         end=System.currentTimeMillis();
//        System.out.println("Demorou: "+(end-start));
        
         start=System.currentTimeMillis();
//        Future<Double> precoAsync = loja.getPrecoAsync();
//        Future<Double> precoAsync1 = loja.getPrecoAsync();
//        Future<Double> precoAsync2 = loja.getPrecoAsync();
//        Future<Double> precoAsync3 = loja.getPrecoAsync();
        Future<Double> precoAsync = loja.getPrecoAsyncTunado();
        Future<Double> precoAsync1 = loja.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = loja.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = loja.getPrecoAsyncTunado();
        end=System.currentTimeMillis();
        System.out.println("Demorou: "+(end-start));
        enrolando();
        
        try {
            System.out.println(precoAsync.get());
            System.out.println(precoAsync1.get());
            System.out.println(precoAsync2.get());
            System.out.println(precoAsync3.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(LojaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LojaTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            System.out.println(System.currentTimeMillis()-start+"ms");
        }
    }
    
    public static long enrolando(){
        long start=System.currentTimeMillis();
       long soma= LongStream.rangeClosed(1L, 1_000_000L)
                .sum();
       long end=System.currentTimeMillis();
       
        System.out.println("Enrolando por "+(end-start)+" ms");
       return soma;
                
    }
}
