/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZkstreams.test;

import br.com.william.devdojo.ZZkstreams.classes.Pessoa;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class StreamTest4Reduce {
    public static void main(String[] args) {
        Stream<Integer> stream=getStream();
        Stream<Integer> stream2=getStream();
        Stream<Integer> stream3=getStream();
        
        Optional<Integer> sum=stream.reduce((x,y)->x+y);
        Integer sum2=stream2.reduce(0,(x,y)->x+y);
        Integer sum3=stream3.reduce(Integer::sum).get();
        Integer maior=((Stream<Integer>)getStream()).reduce(Integer::max).get();
        Integer menor=((Stream<Integer>)getStream()).reduce(Integer::min).get();
        
        System.out.println(sum.get());
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(maior);
        System.out.println(menor);
        
        Stream<Pessoa> streamPessoa=Pessoa.bancoDePessoas().stream();
        Double sumSal=streamPessoa.filter(p->p.getSalario()>400)
                .map(Pessoa::getSalario)
                .reduce( Double::sum)
                .get();
        Double sumSal2=streamPessoa.filter(p->p.getSalario()>400)
                .mapToDouble(Pessoa::getSalario)
                .sum();//Mais rapido
        System.out.println(sumSal);
        System.out.println(sumSal2);
        
    }
    public static Stream getStream(){
        return Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
    }
}
