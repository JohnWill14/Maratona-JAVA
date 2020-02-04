/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Emodificasores.statico.classe;

/**
 *
 * @author usuario
 */
public class Carro {
    //Velocidade limite 240 km
    private String nome;
    private double vMax;
    private static double vLim;
    {
        vLim=240;
    }
    public Carro() {
    }

    public Carro(String nome, double vmin) {
        this.nome = nome;
        this.vMax = vmin;
    }

    public static void setVLim(double vLim){
        Carro.vLim=vLim;
        
    }
    public static double getVLim(){
        return vLim;
    }
    
    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

   
    
    public void print(){
        System.out.println("==============================");
        System.out.println("Nome: "+this.nome);
        
        System.out.println("Velocidade Maxima: "+this.vMax);
        System.out.println("Velocidade Limite: "+vLim);
        
    }
}
