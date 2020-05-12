/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.classes;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Computador {
    private String nome;
    private Double ram;
    private String marca;

    public Computador(String nome, Double ram, String marca) {
        this.nome = nome;
        this.ram = ram;
        this.marca = marca;
    }

    public Computador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
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
        final Computador other = (Computador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Computador{" + "nome=" + nome + '}';
    }
    
    
}
