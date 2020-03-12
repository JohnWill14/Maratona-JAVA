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
public class Gerente extends Funcionario {
    private double participacaoNoLucro;
    public Gerente() {
    }

    public Gerente(String nome, double salario,double participacaoNoLucro) {
        super(nome, salario);
        this.participacaoNoLucro=participacaoNoLucro;
    }

    public double getParticipacaoNoLucro() {
        return participacaoNoLucro;
    }

    public void setParticipacaoNoLucro(double participacaoNoLucro) {
        this.participacaoNoLucro = participacaoNoLucro;
    }

    @Override
    public void calcularPagamento() {
        this.salario+=this.participacaoNoLucro;
    }
    
    
}
