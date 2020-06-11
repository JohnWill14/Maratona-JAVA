    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZDThreads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
class ListaDenomes{ // não he thread safe
    private List<String> nomes=new LinkedList<>();
    public synchronized void add(String nome){
        nomes.add(nome);
    }
    public synchronized void removeFirst(){
        if(nomes.size()>0){
            System.out.println(nomes.remove(0));
            
            System.out.println(Thread.currentThread().getName()+"  retirou");
        }
        else {
            System.out.println(Thread.currentThread().getName()+" não retirou");
        }
    }
}
public class ThreadSaveTest {
    public static void main(String[] args) {
        ListaDenomes lista=new ListaDenomes();
        lista.add("John William");
        
        class RemovedorDeNomes extends Thread{

            public RemovedorDeNomes() {
            }

            public RemovedorDeNomes(String string) {
                super(string);
            }

            public RemovedorDeNomes(ThreadGroup tg, String string) {
                super(tg, string);
            }
            
            @Override
            public void run() {
                lista.removeFirst();
            }
            
        }
        new RemovedorDeNomes("thread1").start();
        new RemovedorDeNomes("thread2").start();
    }
}
