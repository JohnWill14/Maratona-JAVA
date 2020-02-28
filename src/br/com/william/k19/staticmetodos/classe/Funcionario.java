/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.staticmetodos.classe;

/**
 *
 * @author usuario
 */
public class Funcionario {
    private String nome;
    private double salario;
    private static double pisoSalarial;
    static{
        pisoSalarial=25000d;
        
    }
    {
        salario=0;
    }
    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void alteraPisoSalarial(double taxa){
        Funcionario.pisoSalarial+=Funcionario.pisoSalarial*taxa;
    }
    
    public void aumentaSalario(double salario) throws IllegalArgumentException{
        this.salario+=salario;
        if(this.salario>Funcionario.pisoSalarial){
            throw new IllegalArgumentException("Aumento fara valor passar o "
                    + "piso salario");
                    
        }
    }
}
