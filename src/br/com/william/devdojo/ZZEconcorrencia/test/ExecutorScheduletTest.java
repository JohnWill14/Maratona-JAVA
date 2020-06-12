/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
class Beep implements Runnable{

    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("HH:MM:ss").format(new Date())+" beep");
    }
    
}
public class ExecutorScheduletTest {
    private static ScheduledExecutorService ses= Executors.newScheduledThreadPool(1);
    private static void beep(){
//        ses.schedule(new Beep() , 1, TimeUnit.SECONDS);
//        ses.shutdown();
//        ses.scheduleAtFixedRate(new Beep(), 1, 5, TimeUnit.SECONDS);//não respeita o sleep. Conta o tempo de delay
        ScheduledFuture<?> scheduleWithFixedDelay = ses.scheduleWithFixedDelay(new Beep(), 1, 5, TimeUnit.SECONDS); //Só conta quando há processamento
        ses.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cancelando");
                scheduleWithFixedDelay.cancel(false);
                ses.shutdown();
            }
        }, 10, TimeUnit.SECONDS);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
           beep();
    }
}
