/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Wio.test;

import java.io.Console;

/**
 *
 * @author usuario
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console console= System.console();
        String login=console.readLine();
        char[] str= console.readPassword("%s","pwd: ");
        for(char c:str){
            console.format("%c",c);
        }
        console.format("\n");
        console.format("OK\n");
        while(true){
            String texto=console.readLine("%s","Digite algo");
            console.format(">> %s\n",texto);
            if(texto.equals("exit"))break;
        }
        
    }
   
}
