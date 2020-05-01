/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Vresorcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author usuario
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb=ResourceBundle.getBundle("message",new Locale("en","US"));
        //Ki chave linkada com a mensagem
        String traduzido=rb.getString("hello");
        System.out.println(traduzido);
        traduzido=rb.getString("good.morning");
        System.out.println(traduzido);
        System.out.println("\n======BRAZIL=====");
        ResourceBundle rs2=ResourceBundle.getBundle("message",new Locale("pt","BR"));
        System.out.println(rs2.getString("hello"));
        System.out.println(rs2.getString("good.morning"));
        System.out.println(rs2.getString("show"));
        
        //Locale locale = new Locale("fr","CA");
        //ResourceBundle.getBundle("messages",locale);
        //Ele procura a chave nesses caras aqui:
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_en_US.properties
        //messages_en.properties
        //messages.properties
    }
}
