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
public class Conta {
    private double saldo;
    private Agencia agencia;
    private Cliente cliente;
    {
        this.saldo=100d;
    }
    public Conta() {
    }

    public Conta(double saldo, Agencia agencia, Cliente cliente) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public static void print(Conta cont){
        System.out.println("Numero Agencia: "+cont.getAgencia().getNumero());
        System.out.println("Cliente: "+cont.getCliente().getNome());
        System.out.println("Cpf cliente:"+cont.getCliente().getCpf());
        System.out.println("Saldo Conta: "+String.format("%.2f", cont.getSaldo()));
        System.out.println("===================================================\n");
    }
}
