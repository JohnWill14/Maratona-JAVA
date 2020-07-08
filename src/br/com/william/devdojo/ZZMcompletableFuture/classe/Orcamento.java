/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.classe;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Orcamento {

    
    private final String loja; 
    private final double preco;
    private final Desconto.Codigo codigo;

    private Orcamento(String loja, double preco, Desconto.Codigo codigo) {
        this.loja = loja;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    public static Orcamento parse(String orcamento){
                String[] dados=orcamento.split(":");
                return new Orcamento(dados[0], Double.parseDouble(dados[1].replace(",", ".")), Desconto.Codigo.valueOf(dados[2]));
                
    }

    public String getLoja() {
        return loja;
    }

    public double getPreco() {
        return preco;
    }

    public Desconto.Codigo getCodigo() {
        return codigo;
    }
    
}
