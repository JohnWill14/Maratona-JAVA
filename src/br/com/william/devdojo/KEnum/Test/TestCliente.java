/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.KEnum.Test;

import br.com.william.devdojo.KEnum.Classe.Cliente;
import br.com.william.devdojo.KEnum.Classe.TipoPessoa;

/**
 *
 * @author usuario
 */
public class TestCliente {
    public static void main(String[] args) {
        Cliente c1=new Cliente();
        c1.setNome("Jair Gomes");
  //      c1.setTipo(Cliente.PESSOA_FISICA);//Pode passar qualquer valor no Tipo
//        //Nessecita de utilizar Enum
        c1.setTipo(TipoPessoa.PESSOA_JURIDICA);
        c1.setPagamento(Cliente.TipoPagamento.AVISTA);//Isso fica feio pra k7
        System.out.println(c1);
        for (TipoPessoa value : TipoPessoa.values()) {
            System.out.println(value);
        }
       TipoPessoa t=TipoPessoa.PESSOA_JURIDICA;/* 
       TipoPessoa ao criar a variavel tipo Enum ele cria tds os
       objts da lista;
       */
    }
}
