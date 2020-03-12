/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Npolimorfismo.test;

import br.com.william.devdojo.Npolimorfismo.classe.Funcionario;
import br.com.william.devdojo.Npolimorfismo.classe.Gerente;
import br.com.william.devdojo.Npolimorfismo.classe.RelatorioPagamento;
import br.com.william.devdojo.Npolimorfismo.classe.Vendedor;

/**
 *
 * @author usuario
 */
public class TestPolimorfismo {
    public static void main(String[] args) {
        Gerente g=new Gerente("John William", 5000,2000);
        RelatorioPagamento rp=new RelatorioPagamento();
        
        Vendedor v=new Vendedor(2000, "John william Junior", 1000);
        rp.relatorioPagamento(g);
        System.out.println("=============================");
        rp.relatorioPagamento(v);
        
        Funcionario f=(Funcionario)g;
        System.out.println("=============================");
        rp.relatorioPagamento(f);
    }
}
