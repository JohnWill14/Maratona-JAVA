/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZKstreams.classes;

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
    private Genero genero;

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }
    
    
    
    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa() {
    }
    public static List<Pessoa> bancoDePessoas(){
        return Arrays.asList(
                new Pessoa("william Suane", 22, 2000d, Genero.MASCULINO),
                new Pessoa("John William Vicente", 19, 0d, Genero.MASCULINO),
                new Pessoa("Jair Messias Bolsonaro", 63, 30000d, Genero.MASCULINO),
                new Pessoa("Mercy", 28, 3500d, Genero.FEMININO),
                new Pessoa("Ana", 17, 1895d, Genero.FEMININO),
                new Pessoa("Thor", 23, 1980d, Genero.MASCULINO),
                new Pessoa("Hulk", 35, 8000d, Genero.MASCULINO),
                new Pessoa("Flash", 29, 3200d, Genero.MASCULINO),
                new Pessoa("Batman", 37, 10000d, Genero.MASCULINO),
                new Pessoa("Lanterna Verde", 17, 5000d, Genero.MASCULINO)
        );
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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
        return nome ;
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
