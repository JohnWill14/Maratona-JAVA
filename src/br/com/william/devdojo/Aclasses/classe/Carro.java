/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Aclasses.classe;

/**
 *
 * @author usuario
 */
public class Carro {
    private String nome;
    private String placa;
    private float velocidadeMaxima;
    
    public Carro(){
        super();
    }
    public Carro(String nome,String placa,float velocidadeMaxima){
        this.nome=nome;
        this.placa=placa;
        this.velocidadeMaxima=velocidadeMaxima;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setVelocidadeMaxima(float velocidade){
        this.velocidadeMaxima=velocidade;
    }
    public float getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
}
