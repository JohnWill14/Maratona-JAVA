/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.zexemplopratico.capitulo1.test;

import br.com.william.estruturaDeDados.zexemplopratico.capitulo1.classe.CartaoDeCredito;
/**
 *
 * @author usuario
 */
public class TestCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito[] cards=new CartaoDeCredito[3];
        cards[0]=new CartaoDeCredito("8985.4444.333","Tony Stark","31415", 999999.0, 3000);
        cards[1]=new CartaoDeCredito("6573.3423.999","Stevao rogerio","15613", 400, 100);
        cards[2]=new CartaoDeCredito("5849.2022.133","Rick Martin","85944", 3000, 1500);
        
        for(CartaoDeCredito card: cards){
            card.fazPagamento(100);
        }
        
        for(CartaoDeCredito card: cards){
            CartaoDeCredito.print(card);
        }
        
    }
}
