/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.test;

import br.com.william.devdojo.ZZkstreams.classes.Pessoa;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest {
    //Pegar os 3 primeiros nomes  com menos de 25 anos
    //Ordenados pelo nome
    public static void main(String[] args) {
        List<String> listaFinal;
//        listaFinal=getPessoaInterativa();;
        listaFinal=getPessoaStreams();
        for(String s: listaFinal){
            System.out.println(s);
        }
    }
    public static List<String> getPessoaInterativa(){
        int limit=3;
        List<String> listaFinal=new LinkedList<>();
        List<Pessoa> lista=Pessoa.bancoDePessoas();
        lista.sort((a,b)-> a.getNome().compareTo(b.getNome()));
        int cont=0;
        
        for(Pessoa p: lista){
            if(p.getIdade()<=25){
                if(cont<limit){
                    cont++;
                    listaFinal.add(p.getNome());
                }else{
                break;
               }
            }
            
        }
        return listaFinal;
    }
    public static List<String> getPessoaStreams(){
       
        List<Pessoa> lista=Pessoa.bancoDePessoas();
        
        List<String> listaFinal=lista
                .stream()
                .filter(p->p.getIdade()<25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .skip(2)
                .limit(3)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
        
        return listaFinal;
    }
}
