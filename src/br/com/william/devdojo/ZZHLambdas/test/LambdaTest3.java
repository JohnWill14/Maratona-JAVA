/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.test;

import br.com.william.devdojo.ZZHLambdas.classe.Carro;
import br.com.william.devdojo.ZZHLambdas.classe.ComparadorCarro;
import br.com.william.devdojo.ZZHLambdas.classe.Cores;
import static br.com.william.devdojo.ZZHLambdas.test.LambdaTest2.forEach;
import static br.com.william.devdojo.ZZHLambdas.test.LambdaTest2.map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LambdaTest3 {
    public static void main(String[] args) {
         forEach(Arrays.asList("william","John William","DevDojo"), 
                 System.out::println);
         
        List<Carro> listaCarro= Arrays.asList(new Carro(Cores.ROSA, 2000), new Carro(Cores.PRETO, 2005), new Carro(Cores.ROSA, 2001));
        
        //Reference to a method static
        Collections.sort(listaCarro, ComparadorCarro::compareByColor);
        System.out.println(listaCarro);
        
        //Reference to an instance method of a particular object 
        ComparadorCarro compradorCarro=new ComparadorCarro();
        Collections.sort(listaCarro, compradorCarro::compareByAno);
        System.out.println(listaCarro);
        
        //Reference to an instance method of an arbitrary object a particular object 
        List<String> nome=Arrays.asList("william","John William","DevDojo");
        nome.sort(String::compareTo);
        
        System.out.println(nome);
        
        Function<String, Integer> stringToInteger=null;
//        stringToInteger=(String s)->Integer.parseInt(s);
        stringToInteger=Integer::parseInt;
        
        System.out.println(stringToInteger.apply("12"));
        
//        BiPredicate< List<String> , String> countains=(List<String> l,String s)->l.contains(s);
        BiPredicate< List<String> , String> countains=List<String>::contains;
        
        System.out.println(countains.test(Arrays.asList("john","william","Uem","DevDojo"), "john"));
        System.out.println(countains.test(Arrays.asList("john","william","Uem","DevDojo"), "ana"));
    
        //Reference to Construct
        BiFunction<Cores, Integer, Carro> funcionConstruct=(c,i)->new Carro(c, i);
        BiFunction<Cores, Integer, Carro> funcionConstruct2=Carro::new;
        
        System.out.println(funcionConstruct.apply(Cores.CINZA,2020));
        System.out.println(funcionConstruct2.apply(Cores.CINZA,2020));
        
    }
    
    public static <T> void forEach(List<T> lista, Consumer<T> c){
        for(T t:lista){
            c.accept(t);
        }
    }
     public static <T,R> List<R> map(List<T> lista, Function<T,R> f){
        List<R> result=new ArrayList<>();
        for(T t:lista){
            result.add(f.apply(t));
        }
        return result;
    }
}
