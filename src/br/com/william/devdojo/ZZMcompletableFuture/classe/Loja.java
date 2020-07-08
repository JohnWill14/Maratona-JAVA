/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.classe;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Loja {
    private String nome;

    public Loja() {
    }

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public double getPreco(){
        //Vai pegar o preco  onde Judas perdeu as botas
        return calcularPreco();
    }
    
    public Future<Double> getPrecoAsync(){
        CompletableFuture<Double> futuro= new CompletableFuture<>();
        new Thread(
                  ()->{
                    try{
                      futuro.complete(calcularPreco());
                    }catch(Exception ex){
                        futuro.completeExceptionally(ex);
                    }
                  }
        ).start();
        return futuro;
    }
    public Future<Double> getPrecoAsyncTunado(){
        return CompletableFuture.supplyAsync(this::calcularPreco);
    }
    private double calcularPreco(){
        delay();
//        System.out.println(1/0);
        return ThreadLocalRandom.current().nextDouble()*100;
    }
       private static void delay(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
}
