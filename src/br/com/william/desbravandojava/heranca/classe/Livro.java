/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.heranca.classe;

import br.com.william.desbravandojava.inicio.classe.Autor;

/**
 *
 * @author usuario
 */
public  abstract class Livro {
    private String nome;
    private double valor;
    private String descricao;
    private Autor autor;
    {
        this.nome=null;
        this.valor=0d;
        this.descricao=null;
        this.autor=new Autor();
    }
    public Livro(){
        super();
    }
    public Livro(String nome,double valor,String descricao,Autor autor){
        this();
        this.nome=nome;
        this.descricao=descricao;
        this.valor=valor;
        this.autor=autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void imprimir(){
        System.out.println("Nome do Livro:  "+this.nome);
        System.out.println("Valor:          R$ "+String.format("%.2f", this.valor));
        System.out.println("Descricao:      "+this.descricao);
        System.out.println("Autor:          "+this.getAutor().getNome());
        
    }
    
}
