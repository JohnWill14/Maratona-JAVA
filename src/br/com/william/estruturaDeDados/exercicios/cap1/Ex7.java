/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.exercicios.cap1;

/**
 *
 * @author usuario
 */
public class Ex7 {
    private String nome;
    private int petalas;
    private float preco;

    public Ex7() {
    }

    public Ex7(String nome, int petalas, float preco) {
        this.nome = nome;
        this.petalas = petalas;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPetalas() {
        return petalas;
    }

    public void setPetalas(int petalas) {
        this.petalas = petalas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
