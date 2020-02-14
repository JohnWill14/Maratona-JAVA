/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Gassociacao.classe;

/**
 *
 * @author usuario
 */
public class Pessoa {
    private Departamento departamento;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(Departamento departamento, String nome) {
        this.departamento = departamento;
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
