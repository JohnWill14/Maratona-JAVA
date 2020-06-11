/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZDThreads.classe;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class ListaMembros {
    private final Queue<String> emails=new LinkedList<>();
    private boolean listaDeEmailsAberta=true;
    
    public int getEmailsPendentes(){
        synchronized(emails){
            return emails.size();
        }
    }
    public boolean isListaDeEmailsAberta(){
        return listaDeEmailsAberta;
    }
    
    public String obterEmailMembro(){
        String email=null;
        try{
            synchronized(emails){
                while(emails.isEmpty()){
                     if(!listaDeEmailsAberta)return null;
                     System.out.println("Colocando a Thread:"+Thread.currentThread().getName()+" em modo wait:");
                     this.emails.wait();
                }
                email=emails.poll();
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return email;
    }
    public void adicionarEmailMembro(String email){
        synchronized(emails){
            this.emails.add(email);
            System.out.println("Email adicionado com sucesso !!!");
            System.out.println("Notificando as Threads");
//            emails.notify();//Avisa apenas uma Thrad
            emails.notifyAll();//Avisa tds as Thrads
        }
    }
    public void fecharLista(){
        System.out.println("Notificando tds as Threads");
        this.listaDeEmailsAberta=false;
        synchronized(emails){
            emails.notifyAll();
        }
    }
}
