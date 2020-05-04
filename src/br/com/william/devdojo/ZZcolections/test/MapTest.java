/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import br.com.william.devdojo.ZZcolections.classe.Celular;
import br.com.william.devdojo.ZZcolections.classe.Produto;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class MapTest {
    public static void main(String[] args) {
        //K,V => Key Value
        //Não he possivel existir keys duplicadas ou repetidas que é a mesma coisa
        Map<String,String> mapaProduto;
        mapaProduto=new HashMap();// No tocante ao Hash é que a implementação é full efisciente
//        mapaProduto=new LinkedHashMap<>();// Respeita a ordem de inserção
        //put Coloque
        mapaProduto.put("john", "Estudante");
        mapaProduto.put("john", "Estudante JAVA");//Substitui o valor antigo que a key associava
        mapaProduto.put("William Suane", "Mestre do DevDojo");
        mapaProduto.put("Bia", "Paixão platonica que deu errado");
        
        //ForEach intera em cima das keys ou dos values
        for(String key:mapaProduto.keySet()){
            System.out.println("Key: "+key+"=> "+mapaProduto.get(key));
        }
        
        System.out.println("\n");
        for(String value:mapaProduto.values()){
            System.out.print(value+" ");
        }
        System.out.println("");
        
        //Um jeito mais jeitoso
        System.out.println("\nDesse jeito he mais legal:");
        for(Map.Entry<String,String> item:mapaProduto.entrySet()){
            System.out.println(item.getKey()+" => "+item.getValue());
        }
        
        
        
        
    }
}
