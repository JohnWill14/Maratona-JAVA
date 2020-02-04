    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Dblocodeinicializacao.test;

import br.com.william.devdojo.Dblocodeinicializacao.classe.Client;

/**
 *
 * @author usuario
 */
public class TestClient {
    public static void main(String[] args) {
        Client cli=new Client();
        for(int parcela:cli.getParcelas()){
            System.out.print(parcela+" ");
        }
        System.out.println();
    }
}
