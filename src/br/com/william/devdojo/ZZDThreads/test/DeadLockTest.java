/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZDThreads.test;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */

public class DeadLockTest {
    private static Object lock1=new Object();
    private static  Object lock2=new Object();
    
    private static class ThreadExemplo1 extends Thread{

        @Override
        public void run() {
            synchronized(lock1){
                System.out.println("Thread1 lock 1");
                System.out.println("Esperando pelo lock 2");
                synchronized(lock2){
                    System.out.println("Thread1 lock 2");
                    System.out.println("Concluido");
                
                }
            }
        }
        
    }
    private static class ThreadExemplo2 extends Thread{

        @Override
        public void run() {
            synchronized(lock2){
                System.out.println("Thread2 lock 2");
                System.out.println("Esperando pelo lock 1");
                synchronized(lock1){
                    System.out.println("Thread2 lock 2");
                    System.out.println("Concluido");
                
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }
}
