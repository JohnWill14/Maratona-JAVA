/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class CalableTest implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count=ThreadLocalRandom.current().nextInt(1, 11);
        for(int i=0;i<count;i++){
            System.out.println(Thread.currentThread().getName()+" executando");
            
        }
        return "Trabalho finalizado numero sorteado he "+count;
    }
    public static void main(String[] args) {
        CalableTest ct=new CalableTest();
        ExecutorService es=Executors.newCachedThreadPool();
        Future<String> submit = es.submit(ct);
        try {
            System.out.println(submit.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(CalableTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CalableTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        es.shutdown();
    }
}
