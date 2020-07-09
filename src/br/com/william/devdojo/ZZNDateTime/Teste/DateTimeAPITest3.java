/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.Teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class DateTimeAPITest3 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2020, Month.JULY, 8);
        System.out.println(ld);
        
        ld=ld.withYear(2023);
        
        System.out.println(ld);
        
        ld=ld.withMonth(Month.AUGUST.getValue());
        
        System.out.println(ld);
        
        ld=ld.with(ChronoField.DAY_OF_MONTH, 15);
        System.out.println(ld);
        
        ld=ld.plusMonths(3);
        
        System.out.println(ld);
        
        ld=ld.plus(2, ChronoUnit.YEARS);
        
        System.out.println(ld);
        
    }
}
