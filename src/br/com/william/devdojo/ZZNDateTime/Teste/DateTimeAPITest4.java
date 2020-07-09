/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.Teste;

import br.com.william.devdojo.ZZNDateTime.util.DateUtil;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class DateTimeAPITest4 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getDayOfWeek());
        
//        ld=ld.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        ld=ld.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(ld);
        
        ld=ld.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        
        System.out.println(ld);
        
        ld=ld.with(TemporalAdjusters.firstDayOfMonth());
        
        System.out.println(ld.getDayOfWeek());
        
//        LocalDate ld2=LocalDate.of(2000, Month.NOVEMBER, 14);
//        LocalDate ld2=LocalDate.of(1965, Month.DECEMBER, 19);
//        LocalDate ld2=LocalDate.of(1976, Month.DECEMBER, 6);
        LocalDate ld2=LocalDate.of(1988, Month.DECEMBER, 2);
        
        System.out.println(ld2.getDayOfWeek());
        
        DateUtil du=new DateUtil();
        du.adjustInto(ld);
        System.out.println(ld);
        
    }
}
