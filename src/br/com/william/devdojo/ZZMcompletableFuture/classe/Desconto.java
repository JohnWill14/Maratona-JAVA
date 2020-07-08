/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZMcompletableFuture.classe;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class Desconto {
    public enum Codigo{
        NENHUM(0), SILVER(5), GOLD(10), PLATINUM(15), ELITE(20);
        private final int porcentagem;

        private Codigo(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
        
        public static String CalcularDesconto(Orcamento orcamento){
            return String.format("%s o preco original: %.2f, desconto: %d, "
                    + "o preco final: %.2f", orcamento.getLoja(), 
                    orcamento.getPreco(), orcamento.getCodigo().getPorcentagem(),
                    calculo(orcamento.getPreco(), orcamento.getCodigo()));
        }
        
        private static double calculo(double preco, Codigo codigo){
            delay();
            return preco *(100- codigo.porcentagem)/100;
        }
        
        private static void delay(){
        try {
            int delay=ThreadLocalRandom.current().nextInt(500,2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(NovaLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
}
