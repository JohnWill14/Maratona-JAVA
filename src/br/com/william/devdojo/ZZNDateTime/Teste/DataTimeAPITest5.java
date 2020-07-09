/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZNDateTime.Teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */

public class DataTimeAPITest5 {
    public static void main(String[] args) {
        LocalDate loca=LocalDate.now();
        String s1=loca.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2=loca.format(DateTimeFormatter.ISO_DATE);
        String s3=loca.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
        String s4="20201114";
        
        loca=LocalDate.parse(s4,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(loca);
        
        LocalDateTime ldt=LocalDateTime.now();
        
        System.out.println(ldt);
        
        String s5=ldt.format(DateTimeFormatter.ISO_DATE_TIME);
        
        System.out.println(s5);
        
        ldt=LocalDateTime.parse(s5);
        
        //dd/MM/yyyy
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String br=LocalDate.now().format(formatterBr);
        
        System.out.println(br);
        
        LocalDate ldBr=LocalDate.parse(br, formatterBr);
        System.out.println(ldBr);
        
        DateTimeFormatter italiaFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
        
        System.out.println(ldBr.format(italiaFormatter));
        
    }
}
