/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Hheranca.test;

import br.com.william.devdojo.Hheranca.classe.Endereco;
import br.com.william.devdojo.Hheranca.classe.Funcionario;
import br.com.william.devdojo.Hheranca.classe.Pessoa;

/**
 *
 * @author usuario
 */
public class TestHeranca {
    public static void main(String[] args) {
        Endereco endereco=new Endereco("Jardim botanico", "1112");
        
//        Pessoa p1=new Pessoa();
//        p1.setNome("John William");
//        p1.setCpf("123.332.222-66");
//        p1.setEndereco(endereco);
//        p1.imprime();
//        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
//        System.out.println("/|\\/|\\/|\\/|\\/|\\/|\\/|\\/|\\/|\\");
        Funcionario f1=new Funcionario();
        f1.setNome("Augusto");
        f1.setCpf("111.453.323-76");
        f1.setEndereco(endereco);
        f1.setMatricula("13211");
        f1.setSalario(23.55d);
        f1.imprime();
        
    }
}
