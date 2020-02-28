/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Jfinal.test;

import br.com.william.devdojo.Jfinal.classe.Carro;

/**
 *
 * @author usuario
 */
public class TestCarro {
    public static void main(String[] args) {
        Carro c1=new Carro("GOL", "br");
       c1.SB.append("OLA");
        System.out.println(c1.SB.toString());
    }
}
