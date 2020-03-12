package br.com.william.devdojo.Labstract.classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public abstract class  Funcionario extends Pessoa{
    protected int matricula;
    
    protected double salario;

    public Funcionario() {
    }
//
//    @Override
//    public void imprimi() {
//        System.out.println("Nao precisa implementar");
//    }
    
    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calculaSalario();
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+": "
                + "Nome: "+this.nome
                +" ,Matricula: "+String.format("%02d",this.matricula)
                +" ,Salario:   R$ "+String.format("%.2f", this.salario);
                
    }
}
