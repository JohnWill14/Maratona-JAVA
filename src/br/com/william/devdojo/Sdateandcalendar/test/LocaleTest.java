/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Sdateandcalendar.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author usuario
 */
public class LocaleTest {
    public static void main(String[] args) {
        System.out.println("Paises: ");
        for(String str:Locale.getISOCountries()){
            System.out.print(str+" ");
        }
        System.out.println();
        for(String str:Locale.getISOLanguages()){
            System.out.print(str+" ");
        }
        System.out.println("\n=================================\n");
        
        //ISO 639 pt= portugues BR - Brazil, en - ingles, US - Estados Unidos
        Locale localItaly=new Locale("it","IT");
        Locale localSuic=new Locale("it","CH");
        Locale localIndia=new Locale("hi","IN");
        Locale localJapao=new Locale("ja");
        Calendar data=Calendar.getInstance();
        data.set(2000, Calendar.NOVEMBER, 14);
        DateFormat dfItaly=DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat dfSuic=DateFormat.getDateInstance(DateFormat.FULL, localSuic);
        DateFormat dfIndia=DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat dfJapao=DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        
        System.out.println("Italia: "+dfItaly.format(data.getTime()));
        System.out.println("Suiça: "+dfSuic.format(data.getTime()));
        System.out.println("India: "+dfIndia.format(data.getTime()));
        System.out.println("Japao: "+dfJapao.format(data.getTime()));
        //br=> 1.000,89 eua=>1,000.89
        System.out.println(localItaly.getDisplayCountry(localJapao));
        System.out.println(localJapao.getDisplayCountry(localItaly));
        System.out.println(localJapao.getDisplayCountry());
        System.out.println(localIndia.getDisplayCountry());
    }
}
