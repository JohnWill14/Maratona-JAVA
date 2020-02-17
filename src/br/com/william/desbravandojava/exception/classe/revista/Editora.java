/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.exception.classe.revista;

import br.com.william.desbravandojava.exception.classe.revista.*;

/**
 *
 * @author usuario
 */
public class Editora {
    private String nome;
    private String nomeFantasia;
    private String cnpj;

    public Editora() {
    }

    public Editora(String nome, String nomeFantasia, String cnpj) {
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
