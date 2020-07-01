/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.test;

import br.com.william.devdojo.ZZkstreams.classes.Pessoa;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest6Collectors1 {
     //Redução e sumarização de streams em um valor  único
    //Agrupamento de elementos
    //Particionamento de elementos
    public static void main(String[] args) {
        List<Pessoa> pessoas=Pessoa.bancoDePessoas();
       
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(Collectors.counting()));
        
        System.out.println(pessoas.stream().max(Comparator.comparing(Pessoa::getSalario)).get());
        System.out.println(pessoas.stream().min(Comparator.comparing(Pessoa::getSalario)).get());
        System.out.println(pessoas.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)))
                .get()
        );
        
        double sum=Pessoa.bancoDePessoas().stream()
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println("A soma do salario he de R$ "+Pessoa.bancoDePessoas().stream()
                .mapToDouble(Pessoa::getSalario)
                .sum());
        System.out.println("A soma do salario he de R$ "+Pessoa.bancoDePessoas().stream()
                .collect(Collectors.summingDouble(Pessoa::getSalario)));
        
    }
}
