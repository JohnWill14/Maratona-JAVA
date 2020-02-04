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
    public void deposita(double valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor menor ou igual a 0");
        }
        this.saldo+=valor;
    }
    public void saca(double valor){
        if(valor>this.saldo||valor<0){
               throw new IllegalArgumentException("Valor para saque nao permitido"); 
        }
        this.saldo-=valor;
    }
    public void extrato(){
        System.out.println("Numero Agencia: "+this.getAgencia().getNumero());
        System.out.println("Cliente: "+this.getCliente().getNome());
        System.out.println("Cpf cliente:"+this.getCliente().getCpf());
        System.out.println("Saldo Conta: "+String.format("%.2f", this.getSaldo()));
        System.out.println("===================================================\n");
    }
    public static void print(Conta cont){
        System.out.println("Numero Agencia: "+cont.getAgencia().getNumero());
        System.out.println("Cliente: "+cont.getCliente().getNome());
        System.out.println("Cpf cliente:"+cont.getCliente().getCpf());
        System.out.println("Saldo Conta: "+String.format("%.2f", cont.getSaldo()));
        System.out.println("===================================================\n");
    }
    
}
