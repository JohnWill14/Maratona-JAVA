/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class ConcorrenciaDeColecoes {
    public static void main(String[] args) {
         // ConcurrentHashMap
        // ConcurrentLinkedDeque
        // ConcurrentLinkedQueue
        // ConcurrentSkipListMap
        // ConcurrentSkipListSet
        
//        Map<String,String> mapa=new HashMap<>();
        Map<String,String> mapa=new ConcurrentHashMap<>();
        mapa.put("1", "1");
        mapa.putIfAbsent("1", "2");
        System.out.println(mapa.get("1"));
    }
}
