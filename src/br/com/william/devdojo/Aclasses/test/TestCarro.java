/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Aclasses.test;

import br.com.william.devdojo.Aclasses.classe.Carro;
import java.io.PrintStream;

/**
 *
 * @author usuario
 */
public class TestCarro {
    public static PrintStream out;
    public static void main(String[] args) {
        out=System.out;
        Carro car=new Carro();
        car.setNome("GOL");
        car.setPlaca("895859-99");
        car.setVelocidadeMaxima(110.0f);
        print(car);
        
    }
    public static void print(Carro obj){
        out.println("Carro: "+obj.getNome());
        out.println("Placa: "+obj.getPlaca());
        out.println("Velocidade Maxima: "+String.format("%.2f", obj.getVelocidadeMaxima())+" km/h");
    }
}
