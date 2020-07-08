/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class FuteureTest {
    
    private static ExecutorService executorService=Executors.newFixedThreadPool(1); 
    public static void main(String[] args) {
        Future<Double> future= executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return  2000d;
            }
        });
        System.out.println(enrolando());
        
        try {
            
            Double get = future.get(3, TimeUnit.SECONDS);
            System.out.println(get);
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FuteureTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(FuteureTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(FuteureTest.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            executorService.shutdown();
        }
        
        
        System.out.println(enrolando());
    }
    
    public static long enrolando(){
       long soma= LongStream.rangeClosed(1L, 1_000_000L)
                .sum();
       return soma;
                
    }
}
