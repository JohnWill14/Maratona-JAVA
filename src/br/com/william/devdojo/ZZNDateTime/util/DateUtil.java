/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.util;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class DateUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal tmprl) {
        DayOfWeek dow=DayOfWeek.of(tmprl.get(ChronoField.DAY_OF_WEEK)); 
        int proximoDia=1;
        switch(dow){
            case FRIDAY:
                proximoDia=2;
            break;
            case SATURDAY:
                proximoDia=2;
            break;
            
        }
        
        return tmprl.plus(proximoDia, ChronoUnit.DAYS);
    }
    
}
