/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.test;

import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.AviaoSingletonEnum;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
