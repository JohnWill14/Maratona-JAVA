/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
class ThreadTrabalhadoraExecutor implements Runnable{
    private String num;

    public ThreadTrabalhadoraExecutor(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }
    
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" iniciou "+num);
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTrabalhadoraExecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread().getName()+" finalizou "+num);
            
    }
    
}
public class ExecutorTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(8);
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("1"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("2"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("3"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("4"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("5"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("6"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("7"));
        newFixedThreadPool.execute(new ThreadTrabalhadoraExecutor("8"));
//        System.out.println("Finalizado");
        newFixedThreadPool.shutdown();
//        System.out.println(newFixedThreadPool.isTerminated()?"Terminado":"nao terminado");
    }
}
