/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.classe;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Pessoa {
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String nomeDoPai;
    private String nomeDaMae;
    private String apelido;

    public Pessoa() {
    }

    private Pessoa(String nome, String nomeDoMeio, String ultimoNome, String nomeDoPai, String nomeDaMae, String apelido) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.apelido = apelido;
    }
    
    public static class PessoaBuilder{
        private String nome;
        private String nomeDoMeio;
        private String ultimoNome;
        private String nomeDoPai;
        private String nomeDaMae;
        private String apelido;
        public PessoaBuilder(String nome){// Facilita a inicialização de objetos
            this.nome=nome;
        }
        public PessoaBuilder nome(String nome){
            this.nome=nome;
            return this;
        }
        public PessoaBuilder nomeDoMeio(String nomeDoMeio){
            this.nomeDoMeio=nomeDoMeio;
            return this;
        }
        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome=ultimoNome;
            return this;
        }
        public PessoaBuilder nomeDoPai(String nomeDoPai){
            this.nomeDoPai=nomeDoPai;
            return this;
        }
        public PessoaBuilder nomeDaMae(String nomeDaMae){
            this.nomeDaMae=nomeDaMae;
            return this;
        }
        public PessoaBuilder apelido(String apelido){
            this.apelido=apelido;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(this.nome, this.nomeDoMeio, this.ultimoNome, this.nomeDoPai, this.nomeDaMae, this.apelido);
        }

       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nomeDoMeio=" + nomeDoMeio + ", ultimoNome=" + ultimoNome + ", nomeDoPai=" + nomeDoPai + ", nomeDaMae=" + nomeDaMae + ", apelido=" + apelido + '}';
    }
    
    
}
