/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.test;

import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.Moeda;
import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.MoedaFactory;
import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.Pais;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class MoedaTest {
    public static void main(String[] args) {
        MoedaFactory mf=new MoedaFactory();
        Moeda m=mf.criarMoeda(Pais.BRAZIL);
        System.out.println("Brazil: "+m.getSimbolo());
        System.out.println("Estados Unidos: "+mf.criarMoeda(Pais.UNITED_STATES).getSimbolo());
    }
}
