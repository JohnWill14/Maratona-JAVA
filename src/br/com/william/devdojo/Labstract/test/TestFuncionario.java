/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Labstract.test;

import br.com.william.devdojo.Labstract.classe.Funcionario;
import br.com.william.devdojo.Labstract.classe.Vendedor;


/**
 *
 * @author usuario
 */
public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario func=new Vendedor();
        func.setSalario(300);
        System.out.println(func.calculaSalario());
        func.imprimi();
        Funcionario func2=new Funcionario() {
            @Override
            public double calculaSalario() {
                this.salario*=1.01;
                return this.salario;
            }

            @Override
            public void imprimi() {
                System.out.println(this.toString());
            }
        };
        func2.setNome("John William");
        func2.setMatricula(333);
        func2.setSalario(5000);
        func2.calculaSalario();
        func2.imprimi();
        
        System.out.println("======================");
        System.out.println(func.getClass().getSimpleName());
        System.out.println(func2.getClass().getSimpleName()+".");
    }
}
