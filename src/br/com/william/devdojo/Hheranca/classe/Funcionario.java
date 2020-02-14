/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Hheranca.classe;

/**
 *
 * @author usuario
 */
public class Funcionario extends Pessoa {
    private double salario;
    private String matricula;

    public Funcionario() {
        super();
    }
    public Funcionario(double salario, String matricula, String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Salario: "+this.salario);
    }
    
}
