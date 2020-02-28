/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.KEnum.Classe;

/**
 *
 * @author usuario
 */
public class Cliente {
    public enum TipoPagamento{
        AVISTA,APRAZO
    }
    private String nome;
    private TipoPessoa tipo;
    private TipoPagamento pagamento; 
    public Cliente() {
    }

    public Cliente(String nome, TipoPessoa tipo, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.pagamento = pagamento;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + "', tipo=" + tipo + " "+this.tipo.getNome()+", pagamento=" + pagamento + '}';
    }

    
    

    
}
