/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.orientacaoobjeto.test;

import br.com.william.k19.orientacaoobjeto.banco.Agencia;
import br.com.william.k19.orientacaoobjeto.banco.Cliente;
import br.com.william.k19.orientacaoobjeto.banco.Conta;

/**
 *
 * @author usuario
 */
public class TestDeposita {
    public static void main(String[] args) {
         Cliente cli1=new Cliente();
        cli1.setNome("John William Vicente");
        cli1.setIdade(19);
        cli1.setRg("233234");
        cli1.setSexo('M');
        cli1.setCpf("343.332.222-45");
        
        Cliente cli2=new Cliente();
        cli2.setNome("Julia Beatriz Silveira");
        cli2.setIdade(21);
        cli2.setRg("4334343");
        cli2.setSexo('F');
        cli2.setCpf("412.762.321-76");
        
        Agencia agencia=new Agencia(12121);
        
        Conta cont1=new Conta();
        cont1.setAgencia(agencia);
        cont1.setCliente(cli1);
        cont1.setSaldo(5000);
        
        Conta cont2=new Conta();
        cont2.setAgencia(agencia);
        cont2.setCliente(cli2);
        try{
            cont1.deposita(200);
            cont1.deposita(-100);
        }catch(IllegalArgumentException ex){
            System.err.println("Deposito: "+ex.getMessage());
        }finally{
            try{
                cont2.saca(5);
                cont2.saca(-10);
            }catch(IllegalArgumentException ex){
                System.err.println("Saque: "+ex.getMessage());
            }finally{
                    cont1.extrato();
                    cont2.extrato();
            }
        }
        
    }
}
