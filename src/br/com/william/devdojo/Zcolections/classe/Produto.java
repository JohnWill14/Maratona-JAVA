/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.classe;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Produto implements Comparable<Produto>{
    private Long ID;
    private String nome;
    private Double preco;
    private int quantidade;
    
    public Produto() {
    }

    public Produto(Long ID, String nome, Double preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(Long ID, String nome, Double preco, int quantidade) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.ID);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "ID=" + ID + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

   

    @Override
    public int compareTo(Produto t) {
        if(this.nome.equals(t.getNome())){
            if(this.preco.equals(t.getPreco())){
                 return this.ID.compareTo(t.getID());
            }else this.preco.compareTo(t.getPreco());
        } 
        return this.nome.compareToIgnoreCase(t.getNome());
    }
    
    
}
