/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Labstract.classe;

/**
 *
 * @author usuario
 */
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    @Override
    public double calculaSalario() {
        return this.salario;
    }

    @Override
    public void imprimi() {
        System.out.println(this.toString());
    }
    
}
