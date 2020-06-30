/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa() {
    }
    public static List<Pessoa> bancoDePessoas(){
        return Arrays.asList(
                new Pessoa("william Suane", 22, 2000d),
                new Pessoa("John William Vicente", 19, 0d),
                new Pessoa("Jair Messias Bolsonaro", 63, 30000d),
                new Pessoa("Mercy", 28, 3500d),
                new Pessoa("Ana", 19, 1895d),
                new Pessoa("Thor", 23, 1980d),
                new Pessoa("Hulk", 35, 8000d),
                new Pessoa("Flash", 29, 3200d),
                new Pessoa("Batman", 37, 10000d),
                new Pessoa("Lanterna Verde", 24, 5000d)
        );
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + this.idade;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
