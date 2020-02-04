/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.orientacaoobjeto.banco;

/**
 *
 * @author usuario
 */
public class Agencia {
    private int numero;
    {
        numero=0;
    }
    public Agencia(){
        
    }
    public Agencia(int numero){
        this.numero=numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return this.numero;
    }
}
