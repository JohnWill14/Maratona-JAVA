/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Npolimorfismo.classe;

/**
 *
 * @author usuario
 */
public class Vendedor extends Funcionario{
    private double totalDeVendas;

    public Vendedor() {
    }

    public Vendedor(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public Vendedor(double totalDeVendas, String nome, double salario) {
        super(nome, salario);
        this.totalDeVendas = totalDeVendas;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario+=this.totalDeVendas*0.05;
    }
    
    
}
