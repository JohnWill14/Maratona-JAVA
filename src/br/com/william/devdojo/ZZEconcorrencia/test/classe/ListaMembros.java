/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test.classe;

import br.com.william.devdojo.ZZDThreads.classe.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class ListaMembros {
    private final Queue<String> emails=new LinkedList<>();
    private boolean listaDeEmailsAberta=true;
    private final Lock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    public int getEmailsPendentes(){
        try{
            lock.lock();
            return emails.size();
        }finally{
            lock.unlock();
        }
    }
    public boolean isListaDeEmailsAberta(){
        return listaDeEmailsAberta;
    }
    
    public String obterEmailMembro(){
        String email=null;
        try{
            lock.lock();
            while(emails.isEmpty()){
                 if(!listaDeEmailsAberta)return null;
                 System.out.println("Colocando a Thread:"+Thread.currentThread().getName()+" em modo wait:");
                 condition.await();
            }
            email=emails.poll();
            
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            lock.unlock();
        }
        return email;
    }
    public void adicionarEmailMembro(String email){
        try{
            lock.lock();
            this.emails.add(email);
            System.out.println("Email adicionado com sucesso !!!");
            System.out.println("Notificando as Threads");
//            emails.notify();//Avisa apenas uma Thrad
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }
    public void fecharLista(){
        System.out.println("Notificando tds as Threads");
        this.listaDeEmailsAberta=false;
        try{
            lock.lock();
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }
}
