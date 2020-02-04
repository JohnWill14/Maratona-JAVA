/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Emodificasores.statico.test;

import br.com.william.devdojo.Emodificasores.statico.classe.Carro;



/**
 *
 * @author usuario
 */
public class TestCarro {
    public static void main(String[] args) {
        Carro car=new Carro("bmw",180);
        Carro car2=new Carro("fusca",50);
        Carro car3=new Carro("s10",180);
        
        Carro.setVLim(200);
        
        car.print();
        car2.print();
        car3.print();
    }
}
