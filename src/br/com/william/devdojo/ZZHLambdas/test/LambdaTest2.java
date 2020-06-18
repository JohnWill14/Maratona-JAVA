/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(Arrays.asList("william","John William","DevDojo"), 
                (String s)->System.out.println(s));
        List<Integer> tamanhos=map(Arrays.asList("william","John William","DevDojo"), 
                (String s)->s.length());
        System.out.println(tamanhos);
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
