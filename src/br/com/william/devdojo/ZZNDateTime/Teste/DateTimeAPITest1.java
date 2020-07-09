/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.Teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class DateTimeAPITest1 {
    public static void main(String[] args) {
        Date d=new Date();
        LocalDate ld=LocalDate.now();
        
        System.out.println(d);
        System.out.println(ld);
        System.out.println(Calendar.getInstance());
        
        LocalDate ld2=LocalDate.of(2020, 7, 8);
        
        System.out.println(ld2);
        
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getEra());
        System.out.println(ld.lengthOfYear());
        System.out.println(ld.isLeapYear());
        
        //---------LocalTime---------
        System.out.println("---------LocalTime---------");
        LocalTime ldt=LocalTime.of(22,2,15);
        
        System.out.println(ldt);
        
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
        System.out.println(LocalTime.MIDNIGHT);
        
        //---------Parsing---------
        System.out.println("---------Parsing---------");
        
        LocalDate parse = LocalDate.parse("2017-02-15");
        //---------Parsing---------
        System.out.println("---------LocalDateTime---------");
        
        LocalDateTime ldt22 = LocalDateTime.now();
        LocalDateTime ldt12 = LocalDateTime.of(2017,Month.DECEMBER,25, 8,12,45);
        
        System.out.println(ldt22);
        System.out.println(ldt12);
        
        
        
    }
}
