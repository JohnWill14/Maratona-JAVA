/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import br.com.william.devdojo.ZZEconcorrencia.test.classe.Entregador;
import br.com.william.devdojo.ZZEconcorrencia.test.classe.ListaMembros;
import javax.swing.JOptionPane;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class EntregadorTeste {
    public static void main(String[] args) {
        ListaMembros membros=new ListaMembros();
        
        Thread t1=new Thread(new Entregador(membros),"Entregador 1");
        Thread t2=new Thread(new Entregador(membros),"Entregador 2");
        t1.start();
        t2.start();
        while(true){
            String email=JOptionPane.showInputDialog("Digite o email do membro");
            if(email==null||email.equals("")){
                membros.fecharLista();
                break;
            }
            membros.adicionarEmailMembro(email);
        }
    }
}
