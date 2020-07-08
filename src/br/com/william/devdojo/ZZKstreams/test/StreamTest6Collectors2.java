/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZKstreams.test;

import br.com.william.devdojo.ZZKstreams.classes.Genero;
import br.com.william.devdojo.ZZKstreams.classes.Maioridade;
import br.com.william.devdojo.ZZKstreams.classes.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest6Collectors2 {
    //Agrupamento
    public static void main(String[] args) {
        List<Pessoa> pessoas=Pessoa.bancoDePessoas();
        Map<Genero, List<Pessoa>> generoLista=new HashMap<>();
        List<Pessoa> masculino= new ArrayList<>();
        List<Pessoa> feminino= new ArrayList<>();
        
        for(Pessoa p: pessoas){
            if(Genero.MASCULINO.equals(p.getGenero())){
                masculino.add(p);
            }else{
                feminino.add(p);
            }
        }
        
        generoLista.put(Genero.FEMININO, feminino);
        generoLista.put(Genero.MASCULINO, masculino);
        
        System.out.println(generoLista);
        
        //Agrupando por genêro
        Map<Genero, List<Pessoa>> collect = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getGenero));
        
        System.out.println(collect);
        
        //Agrupar por maioridade
        Map<Maioridade, List<Pessoa>> collect1 = Pessoa.bancoDePessoas().stream()
                .collect(groupingBy(p->p.getIdade()<18? Maioridade.MENOR: Maioridade.MAIOR));
        System.out.println(collect1);
        
        //Agrupando por gênero e maioridade
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream()
                .collect(
                        groupingBy(Pessoa::getGenero,groupingBy(p->p.getIdade()<18? Maioridade.MENOR: Maioridade.MAIOR)));
        System.out.println(collect2);
        
        //Agrupando por genero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect3);
        
        //Agrupando por genero e Salario com Option
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,
                        Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect4);
        
        //Agrupando por genero e Salario sem Option
        Map<Genero, Pessoa> collect5 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, 
                collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
        System.out.println(collect5);
        
        //Agrupamento por genero e estastística
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect6);
        
        //Agrupando por gênero e maioridade
        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,mapping(p->p.getIdade()<18? Maioridade.MENOR: Maioridade.MAIOR, toSet())));
        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,mapping(p->p.getIdade()<18? Maioridade.MENOR: Maioridade.MAIOR, toCollection(LinkedHashSet::new ))));
        Map<Genero, Long> collect9 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,mapping(p->p.getIdade()<18? Maioridade.MENOR: Maioridade.MAIOR, counting() )));
        System.out.println(collect7);
        System.out.println(collect8);
        System.out.println(collect9);
    }
    
}
