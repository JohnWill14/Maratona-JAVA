/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Sdateandcalendar.test;

import java.text.DateFormat;
import java.util.Calendar;


/**
 *
 * @author usuario
 */
public class DateFormatedTest {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        DateFormat[] formatacoes=new DateFormat[6];
        formatacoes[0]=DateFormat.getInstance();
        formatacoes[1]=DateFormat.getDateInstance();
        formatacoes[2]=DateFormat.getDateInstance(DateFormat.SHORT);
        formatacoes[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        formatacoes[4]=DateFormat.getDateInstance(DateFormat.LONG);
        formatacoes[5]=DateFormat.getDateInstance(DateFormat.FULL);
        
        for(DateFormat df:formatacoes){
            System.out.println(df.format(c.getTime()));
        }
       
    }
}
