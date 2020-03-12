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
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor() {
        super();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    

    public Vendedor(double comissao, int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return   super.toString()+", Comissao=" + comissao ;
    }

    @Override
    public double calculaSalario() {
        this.salario*=1.05;
        return this.getSalario();
    }

    @Override
    public void imprimi() {
        System.out.println(this.toString());
    }
    
}
