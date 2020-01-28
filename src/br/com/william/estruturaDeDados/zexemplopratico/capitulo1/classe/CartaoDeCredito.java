/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.zexemplopratico.capitulo1.classe;

/**
 *
 * @author usuario
 */
public class CartaoDeCredito {
    private String numero;
    private String nome;
    private String banco;
    private double balance;
    private int limite;

    public CartaoDeCredito() {
    }

    public CartaoDeCredito(String numero, String nome, String banco, double balance, int limite) {
        this.numero = numero;
        this.nome = nome;
        this.banco = banco;
        this.balance = balance;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    //Metodos de acao
    
    public boolean valoraserRetirado(double valor){
        
        if(valor+balance>(double)limite){
            return false;
        }
        balance+=valor;
        return true;
        
    }
    public void fazPagamento(double valor){
        balance-=valor;
    }
    public static void print(CartaoDeCredito card){
        System.out.println("Nome: "+card.getNome());
        
        System.out.println("Numero: "+card.getNumero());
        System.out.println("Banco: "+card.getBanco());
        System.out.println("Balanco: "+String.format("%.2f", card.getBalance()));
        System.out.println("Limite: "+card.getLimite());
        System.out.println("=============================\n");
    }
}
