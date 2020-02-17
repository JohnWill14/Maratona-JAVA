/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.exception.classe;

import br.com.william.desbravandojava.exception.classe.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class CarrinhoDeCompras {
    private double valor;
    private ArrayList<Produto> lista;
    private ArrayList<Imprimi> listaImpressao;
    {
        this.valor=0;
        lista=new ArrayList<>();
        listaImpressao=new ArrayList<>();
    }
    public void addCarrinho(Produto pd){
        this.addListas(pd);
        valor+=pd.getValor();
    }
    public double getTotal(){
        return this.valor;
    }
    public List<Produto> getLista(){
        return lista;
    }
    private void addListas(Produto pd){
        lista.add(pd);
        listaImpressao.add((Imprimi)pd);
    }
    public void imprimiLista(){
         for(Imprimi pdt:this.listaImpressao){
            pdt.imprimi();
            System.out.println("==========================");
        }
    }
}
