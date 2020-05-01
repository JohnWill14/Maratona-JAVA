/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Sdateandcalendar.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author usuario
 */
public class SimpleDateFormatedTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("hh:m:ss a '-' EEEE dd/MMMM/Y zzzz ZZZZ"); 
        Calendar c=Calendar.getInstance();
        System.out.println(sdf.format(c.getTime()));
        
    }
}
