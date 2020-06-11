 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LookTest {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        Thread th=new Thread(new worker("A", lock));
        Thread th1=new Thread(new worker("B", lock));
        Thread th2=new Thread(new worker("C", lock));
        Thread th3=new Thread(new worker("D", lock));
        Thread th4=new Thread(new worker("E", lock));
        Thread th5=new Thread(new worker("F", lock));
        
        th.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
    public static class worker implements Runnable{
        private String nome;
        private ReentrantLock lock;

        public worker(String nome, ReentrantLock lock) {
            this.nome = nome;
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();
            try{
                if(lock.isHeldByCurrentThread())
                    System.out.println("Thread "+nome+" entrou em uma sessão critica");
                System.out.println(lock.getQueueLength()+" threads esperando por esse lock");
                
                System.out.println("Trabalhando por 4 segundos");
                Thread.sleep(4000);
                System.out.println("Trabalho concluido\n");
                System.out.println("-------------------");
                
                lock.unlock();
            }catch(Exception ex){
                ex.printStackTrace();
            }
            finally{
            
        }
        }
        
    }
}
