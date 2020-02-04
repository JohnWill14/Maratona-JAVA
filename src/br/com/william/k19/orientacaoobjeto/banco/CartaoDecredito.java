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
public class CartaoDecredito {
    private int numero;
    private String dataDeValidade;
    private Cliente cliente;

    public CartaoDecredito() {
    }

    public CartaoDecredito(int numero, String dataDeValidade, Cliente cliente) {
        this.numero = numero;
        this.dataDeValidade = dataDeValidade;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    public static void print(CartaoDecredito cart){
        System.out.println("Numero: "+cart.getNumero());
        System.out.println("Cliente: "+cart.getCliente().getNome());
        System.out.println("Cpf cliente:"+cart.getCliente().getCpf());
        System.out.println("Data Validade: "+cart.getDataDeValidade());
        System.out.println("=========================================");
    }
}
