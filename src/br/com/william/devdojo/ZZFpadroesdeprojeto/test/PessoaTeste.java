/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZFpadroesdeprojeto.test;

import br.com.william.devdojo.ZZFpadroesdeprojeto.classe.Pessoa;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa.PessoaBuilder("John")
                .nome("John")
                .apelido("bigJow")
                .nomeDaMae("Ione")
                .nomeDoMeio("William")
                .nomeDoPai("Geraldo")
                .ultimoNome("Vicente")
                .build();
        System.out.println(pessoa);
    }
}
