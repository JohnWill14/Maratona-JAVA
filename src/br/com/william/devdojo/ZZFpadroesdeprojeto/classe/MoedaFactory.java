/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.classe;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class MoedaFactory {
    public Moeda criarMoeda(Pais pais){
        switch(pais){
            case BRAZIL:
                return new Real();
            case UNITED_STATES:
                return new USDolar();
        }
        throw new IllegalArgumentException("País ilegal");
    }
}
