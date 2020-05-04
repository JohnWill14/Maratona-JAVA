/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Consumidor;
import br.com.william.devdojo.Zcolections.classe.Produto;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor=new Consumidor("John William", "123.765.324-65");
        Consumidor consumidor2=new Consumidor("My Wife", "667.765.444-76");
        Consumidor consumidor3=new Consumidor("My Wife54544", "667.765.444-76");
        
        Produto produto1=new Produto(5L, "Picanha", 50d, 10);
        Produto produto2=new Produto(2L, "Veja", 56.78, 0);
        Produto produto3=new Produto(3L, "nokia tijolão", 115d, 0);
        Produto produto4=new Produto(4L, "mario kart", 225.78, 3);
        
        List<Produto> cons1=new LinkedList();
        cons1.add(produto1);
        cons1.add(produto2);
        
        List<Produto> cons2=new LinkedList();
        cons2.add(produto3);
        cons2.add(produto4);
        
        @SuppressWarnings("unchecked")
        Map<Consumidor,List<Produto> > map=new HashMap();
        
        map.put(consumidor, cons1);
        map.put(consumidor2, cons2);
        //Troca o valor da chave e não a key em si
//        map.put(consumidor3, cons1);//Sobrescreve os valores da chave que posssui o msm cpf
        
        for(Map.Entry<Consumidor, List<Produto>> entry:map.entrySet()){
            System.out.print(entry.getKey().getNome()+" => ");
            int size=entry.getValue().size();
            for(int i=0;i<size;i++){
                System.out.print(entry.getValue().get(i).getNome());
                if(i==size-1)System.out.println(".");
                else System.out.print(", ");
            }
        }
        
    }
}
