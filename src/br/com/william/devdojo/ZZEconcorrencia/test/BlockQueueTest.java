/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class BlockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq=new ArrayBlockingQueue<>(1);
        Thread t1=new Thread(new RemoveFromQueue(bq),"removedor");
//        t1.start();
        bq.put("john william");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
//        t1.start();
        bq.put("DevDojo");
        System.out.println("Inserido o ultimo valor");
    }
    static class RemoveFromQueue implements Runnable{
        private BlockingQueue<String> block;

        public RemoveFromQueue(BlockingQueue<String> block) {
            this.block = block;
        }
        
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" entrando  em espera por 2 segundos");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Removendo valor: "+block.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(BlockQueueTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
