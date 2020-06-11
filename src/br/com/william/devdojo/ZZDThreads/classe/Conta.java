/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZDThreads.classe;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Conta {
    private int saldo=50;

    public int getSaldo() {
        return saldo;
    }
    
    public void saque(int valor){
        saldo-=valor;
    }
}
