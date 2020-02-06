/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.inicio.classe;

/**
 *
 * @author usuario
 */
public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private Ator ator;
    private String isbn;//Numero de indentificacao internacional
    {
    this.nome="Nome nao informado";
    this.descricao="Nao possui descricao";
    this.valor=0;
    this.isbn="Nao informado";
    this.ator=null;
    }

    public Livro() {
    }

    public Livro(String nome, String descricao, double valor, String isbn) {
        this();
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }
    public Livro(String nome, String descricao, double valor, String isbn,Ator ator) {
        this(nome,descricao,valor,isbn);
        this.ator=ator;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor: "+String.format("%.2f", this.valor));
        System.out.println("Descricao: "+this.descricao);
        System.out.println("ISBN: "+this.isbn);
        if(this.getAtor()!=null)
        System.out.println("Ator: "+this.getAtor().getNome());
    }
}
