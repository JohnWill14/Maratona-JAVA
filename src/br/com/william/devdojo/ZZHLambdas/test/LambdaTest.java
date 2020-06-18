/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.test;

import br.com.william.devdojo.ZZHLambdas.classe.Carro;
import br.com.william.devdojo.ZZHLambdas.classe.Cores;
import br.com.william.devdojo.ZZHLambdas.interfaces.CarroPredicate;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LambdaTest {
    //anonima
    //funcao, não está associado a nenhuma classe
    //passada por ai
    //concisa
    //(Carro carro) -> carro.getCor.equals("verde")/
    //(String str)->str.length()
    //(int a,int b) -> {sout(a+b)}
    public static void main(String[] args) {
        CarroPredicate<Carro> cp;
        cp = (Carro car)-> car.getCor().equals(Cores.VERDE);
        System.out.println(cp.test(new Carro(Cores.VERDE, 2000)));
        
    }
}
