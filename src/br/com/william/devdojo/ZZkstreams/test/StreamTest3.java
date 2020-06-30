/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.test;

import br.com.william.devdojo.ZZkstreams.classes.Pessoa;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest3 {
    public static void main(String[] args) {
         List<Pessoa> lista=Pessoa.bancoDePessoas();
         
        System.out.println( lista.stream()
              .anyMatch(p->p.getIdade()<=18&&p.getSalario()<3000));
        System.out.println( lista.stream()
              .anyMatch(p->p.getSalario()<4000));//Alguém
        System.out.println( lista.stream()
              .allMatch(p->p.getIdade()>18));//Todo mundo
        System.out.println( lista.stream()
              .noneMatch(p->p.getIdade()>18));// Ninguém
        lista.stream()
                .filter(p->p.getIdade()>25)
                .findAny()//Retorna algum
                .ifPresent(p->System.out.println(p.getNome()+" "+p.getIdade()));
       
        lista.stream()
                .filter(p->p.getIdade()>30)
//                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .findFirst()//Retorna o primeiro
                .ifPresent(p->System.out.println(p.getNome()+" "+p.getIdade()));
                
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
