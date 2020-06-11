/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
class MapReadWrite{
    private Map<String,String> map=new LinkedHashMap<>();
    
    public void put(String key,String value){
        map.put(key, value);
    }
    public Object[] allKeys(){
        return map.keySet().toArray();
    }
}
public class MapReadWriteLockTest {
    private final static MapReadWrite mapReadWrite=new MapReadWrite();
    private final static ReentrantReadWriteLock rrwl=new ReentrantReadWriteLock();
    
    public static void main(String[] args) {
        Thread th1=new Thread(new Write());
        Thread th2=new Thread(new Read());
        Thread th3=new Thread(new Read());
        th1.start();
        th2.start();
        th3.start();
    }
    public static class Write implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                
                rrwl.writeLock().lock();
                try{
                    
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i+1));
                }finally{
                    rrwl.writeLock().unlock();
                }
            }
        }
        
    }
    public static class Read implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                
                    rrwl.readLock().lock();
                try{
                    
                    System.out.println(Thread.currentThread().getName()+" "+Arrays.toString(mapReadWrite.allKeys()));
                }finally{
                    rrwl.readLock().unlock();
                }
            }
        }
        
    }
    
}
