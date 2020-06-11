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
//Daemon e USer

class ThreadExample extends Thread{
    private char c;
    public ThreadExample(char c){
        this.c=c;
    }
    
    @Override
    public  void run() {
        
        System.out.println("\n Thread sendo executada: "+Thread.currentThread().getName());
        for(int i=0;i<1000;i++){
            
            System.out.print(c);
            if(i%100==0)System.out.println();
            
            Thread.yield();//não passar para o estado de espera, não confiavel
            
            
            
        }
    }
    
}
class ThreadRunnable implements Runnable{
    private int c;
    public ThreadRunnable(int c){
        this.c=c;
    }
    
    @Override
    public  void run() {
        
        System.out.println("\n Thread sendo executada: "+Thread.currentThread().getName());
        for(int i=0;i<100;i++){
            
            System.out.print(c);
            if(i%9==0&&i!=0)System.out.println();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                System.out.println(ex);
//            }
        }
    }
    
}
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("\n"+Thread.currentThread().getName());
        ThreadExample t1=    new ThreadExample('A');
        ThreadExample t2=    new ThreadExample('B');
        ThreadExample t3=    new ThreadExample('C');
//        t1.start();
//        t2.start();
//        t3.start();
        ThreadRunnable tr=new ThreadRunnable(1);
        ThreadRunnable tr2=new ThreadRunnable(2);
        ThreadRunnable tr3=new ThreadRunnable(3);
        
        Thread th=new Thread(tr);
        
        th.start();
        th.join();//Para a execução do main até que a Thread execute td
//        tr.run();
        
        Thread th2=new Thread(tr2);
        th2.start();
        
        Thread th3=new Thread(tr3);
        th3.start();//Chama apenas uma vez
//        th3.start();

//    th3.setPriority(10);//prioridade de 1 até 10, 10 he maior 
        
    }
}
