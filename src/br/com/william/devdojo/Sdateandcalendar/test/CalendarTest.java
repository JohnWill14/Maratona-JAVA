/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Sdateandcalendar.test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getClass().getSimpleName());
        calendar.setTime(new Date(1_000_000_000L));
        System.out.println(calendar);
        if(Calendar.SUNDAY==calendar.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }else 
            System.out.println("Domingo não é o primeiro dia da semana");
        System.out.println("\n=============================\n");
        calendar=Calendar.getInstance();
        System.out.println("Dia da semana no mes "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia no mes "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia no ano "+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Horas "+calendar.get(Calendar.HOUR));
        calendar.add(Calendar.HOUR, -1);
        calendar.roll(Calendar.MONTH, 5);
        Date date=calendar.getTime();
        
        System.out.println(date);
        //NumberFormat, Locale, Calendar, Date, DateFormat
    }   
    
}
