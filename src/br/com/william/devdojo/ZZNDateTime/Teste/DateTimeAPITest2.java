/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.Teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class DateTimeAPITest2 {
    public static void main(String[] args) {
        Instant inst=Instant.now();
        System.out.println(inst);
        System.out.println(LocalDateTime.now());
        
        System.out.println(inst.getEpochSecond());
        System.out.println(inst.getNano());
        
        System.out.println(Instant.ofEpochSecond(3));
        //-------Duration-------
        
        System.out.println("-------Duration-------");
        
        LocalDateTime ldt1=LocalDateTime.now();
        LocalDateTime ldt2=LocalDateTime.of(2017, Month.JANUARY, 1, 23, 0);
        LocalTime lt1= LocalTime.now();
        LocalTime lt2= LocalTime.of(5,0, 0);
        
        Duration duration=Duration.between(ldt1, ldt2);
        Duration duration1=Duration.between(lt1, lt2);
        Duration duration2=Duration.between(Instant.now(), Instant.now().plusSeconds(10000));
        
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
        
         //-------Period-------
        
        System.out.println("-------Period-------");
        
        Period p1=Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
        
        System.out.println(p1);
    }
}
