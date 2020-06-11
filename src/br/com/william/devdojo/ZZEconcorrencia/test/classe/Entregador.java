/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test.classe;

import br.com.william.devdojo.ZZDThreads.classe.*;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Entregador implements Runnable{
    private ListaMembros membrosConvidados;

    public Entregador(ListaMembros membrosConvidados) {
        this.membrosConvidados = membrosConvidados;
    }

    public Entregador() {
        membrosConvidados=new ListaMembros();
    }
    
    @Override
    public void run() {
        String nomeThread=Thread.currentThread().getName();
        System.out.println("Nome Thread começando o trabalho: "+nomeThread);
        int qtdMembros=membrosConvidados.getEmailsPendentes();
        boolean aberta=membrosConvidados.isListaDeEmailsAberta();
        while(aberta|| qtdMembros>0){
            try{
                String email=membrosConvidados.obterEmailMembro();
                if(email!=null){
                    System.out.println(nomeThread+" enviando email "+email);
                    Thread.sleep(2000);
                    System.out.println("Envio para email "+email+" concluído com sucesso!");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
            aberta=membrosConvidados.isListaDeEmailsAberta();
            qtdMembros=membrosConvidados.getEmailsPendentes();
            
        }
        System.out.println(nomeThread+" finalizou trabalho");
    }
     
}
