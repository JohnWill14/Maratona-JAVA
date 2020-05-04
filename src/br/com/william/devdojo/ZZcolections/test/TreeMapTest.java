/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class TreeMapTest {
    private static class StringReverse implements Comparator<String>{

        @Override
        public int compare(String t, String t1) {
            return -t.compareTo(t1);
        }
        
    }
    public static void main(String[] args) {
        NavigableMap<String,String> map=new TreeMap<>();
//        NavigableMap<String,String> map=new TreeMap<>(new StringReverse());
        
        
        //Pede um compareble nas keys da vida
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("C", "Letra C");
        //Ordena as chaves
        for(Map.Entry<String,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
        //Retorna um map com chaves menores do que a passada e ainda há uma vinculação desse map com o map original
        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C",true));//inclui o a chave que vc passou se ela existir
        System.out.println("Size: "+map.size());
        System.out.println(map.pollFirstEntry());//Retorna o primeiro termo e remove o mesmo
        System.out.println(map.pollLastEntry());//Retorna o ultimo termo e remove o mesmo
        System.out.println("Size: "+map.size());
    }
}
