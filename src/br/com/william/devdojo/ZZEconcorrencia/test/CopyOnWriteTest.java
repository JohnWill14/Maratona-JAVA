/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
final class Pessoa{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
public class CopyOnWriteTest implements Runnable{
//    private List<Integer> lista=Collections.synchronizedList(list);;
    private List<Integer> lista=new CopyOnWriteArrayList<>();
//    private Set<Integer> listaSet=new CopyOnWriteArraySet<>();

    public CopyOnWriteTest() {
         for (int i = 0; i < 9000; i++) {
            lista.add(i);
        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator=lista.iterator();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(CopyOnWriteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (iterator.hasNext()) {
            System.out.println(Thread.currentThread().getName()+" "+iterator.next());
            
        }
    }

    public List<Integer> getLista() {
        return lista;
    }
    
    public static void main(String[] args) {
        CopyOnWriteTest cwt=new CopyOnWriteTest();
        Thread th1=new Thread(cwt,"t1");
        Thread th2=new Thread(cwt,"t2");
        Thread remove=new Thread(new RemoveElementos(cwt.getLista()),"removedor");
        th1.start();
        th2.start();
        remove.start();
    }
    
    private static class RemoveElementos implements Runnable{
        private List<Integer> lista;

        public RemoveElementos(List<Integer> lista) {
            this.lista = lista;
        }
        
        
        @Override
        public void run() {
            for(int i=0;i<500;i++){
                System.out.println(Thread.currentThread().getName()+" removeu "+lista.remove(i));
            }
        }
        
    }
}
