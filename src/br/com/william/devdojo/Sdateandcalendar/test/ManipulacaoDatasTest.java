/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Sdateandcalendar.test;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class ManipulacaoDatasTest {
    public static void main(String[] args) {
        Date data=new Date(1_000_000_000_000L);//separar os numeros com '_' apartir do 7
        Date data2=new Date(0L);//separar os numeros com '_' apartir do 7
        System.out.println(data);
        System.out.println(data2);
        Date now=new Date();
        System.out.println(now+" => "+now.getTime());
        
    }
}
