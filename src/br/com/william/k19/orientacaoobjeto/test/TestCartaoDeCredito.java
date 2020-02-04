/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.orientacaoobjeto.test;

import br.com.william.k19.orientacaoobjeto.banco.CartaoDecredito;
import br.com.william.k19.orientacaoobjeto.banco.Cliente;

/**
 *
 * @author usuario
 */
public class TestCartaoDeCredito {
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
        
        CartaoDecredito cart=new CartaoDecredito();
        cart.setNumero(123121);
        cart.setDataDeValidade("20/03/2020");
        cart.setCliente(cli1);
        
        CartaoDecredito cart2=new CartaoDecredito();
        cart2.setNumero(20302);
        cart2.setDataDeValidade("30/05/2020");
        cart2.setCliente(cli2);
        CartaoDecredito.print(cart);
        CartaoDecredito.print(cart2);
    }
}
