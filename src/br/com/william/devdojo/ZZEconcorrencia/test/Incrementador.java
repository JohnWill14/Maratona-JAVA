/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Incrementador extends Thread{
    private Contador cont;

    public Incrementador(Contador cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            cont.increment();
        }
    }
    
}
