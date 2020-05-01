/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Tnumberformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        float valor=12663.4567f;
        NumberFormat[] nf=new NumberFormat[5];
        
        System.out.println("Números:\n");
        nf[0]=NumberFormat.getInstance(Locale.ITALY);
        nf[1]=NumberFormat.getInstance(Locale.FRANCE);
        nf[2]=NumberFormat.getInstance(Locale.GERMAN);
        nf[3]=NumberFormat.getInstance(Locale.JAPAN);
        nf[4]=NumberFormat.getInstance(Locale.UK);
        for(NumberFormat n:nf){
            System.out.println(n.format(valor));
        }
        System.out.println("\n\nMoedas:\n");
        nf[0]=NumberFormat.getCurrencyInstance(Locale.ITALY);
        nf[1]=NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        nf[2]=NumberFormat.getCurrencyInstance(Locale.GERMAN);
        nf[3]=NumberFormat.getCurrencyInstance(Locale.JAPAN);
        nf[4]=NumberFormat.getCurrencyInstance(Locale.UK);
         for(NumberFormat n:nf){
            System.out.println(n.format(valor));
        }
       NumberFormat numeroFormat=NumberFormat.getInstance(Locale.CANADA);
        System.out.println("Maximo de digitos quebrados: "+numeroFormat.getMaximumFractionDigits());
        numeroFormat.setMaximumFractionDigits(5);
        System.out.println("Maximo de digitos quebrados: "+numeroFormat.getMaximumFractionDigits());
        System.out.println("        Canada: "+numeroFormat.format(333333.6658886));
        System.out.println("Maximo de digitos: "+numeroFormat.getMaximumIntegerDigits());
        String valorStr="1223.444a";
        try {
            System.out.println(numeroFormat.parse(valorStr));
            numeroFormat.setParseIntegerOnly(true);//Ignora os numeros quebrados         
            System.out.println(numeroFormat.parse(valorStr));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
