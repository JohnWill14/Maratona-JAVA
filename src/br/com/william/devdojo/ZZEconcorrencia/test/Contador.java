/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Contador {
    private int count;
    private AtomicInteger c=new AtomicInteger();
    private Lock look=new ReentrantLock();
    public void increment(){
        look.lock();
        try{
            count++;
            c.getAndIncrement();
        }finally{
            look.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public int getC() {
        return c.intValue();
    }
    
}
