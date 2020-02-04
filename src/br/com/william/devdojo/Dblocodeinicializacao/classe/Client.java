/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Dblocodeinicializacao.classe;

/**
 *
 * @author usuario
 */
public class Client {
    //1. Aloca-se espaço na memoria
    //2. Inicializa atributos com valor default
    //3. Bloco de inicialização é chamado pq ele he da hora
    //4. Oconstrutor é executado
    private int[] parcelas;
    {
        parcelas=new int[100];
        for(int i=1;i<=100;i++){
            parcelas[i-1]=i;
        }
    }
    public Client() {
        
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    
    
    
}
