/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ioverride.test;

import br.com.william.devdojo.Ioverride.classe.Pessoa;

/**
 *
 * @author usuario
 */
public class TestPessoa {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa("Jisele da esquina", 19);
        System.out.println(p1);
        System.out.println(Integer.toHexString(p1.hashCode()));
        Pessoa p2=new Pessoa("Chiquinha da esquina", 19);
        System.out.println(p2);
    }
}
