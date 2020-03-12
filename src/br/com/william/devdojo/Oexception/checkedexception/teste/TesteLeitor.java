/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.checkedexception.teste;

import br.com.william.devdojo.Oexception.checkedexception.classes.Leitor1;
import br.com.william.devdojo.Oexception.checkedexception.classes.Leitor2;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class TesteLeitor {
    public static void main(String[] args) {
        try {
            leitor();
        } catch (Exception ex) {
            Logger.getLogger(TesteLeitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void leitor() throws Exception{
        try(Leitor1 l1=new Leitor1();
            Leitor2 l2=new Leitor2() ){
            
        }
    }
}
