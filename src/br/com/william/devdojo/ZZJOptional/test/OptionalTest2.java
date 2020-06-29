/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZJOptional.test;

import br.com.william.devdojo.ZZJOptional.classe.Carro;
import br.com.william.devdojo.ZZJOptional.classe.Pessoa;
import br.com.william.devdojo.ZZJOptional.classe.Seguradora;
import java.util.Optional;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora=new Seguradora("DevDojo seguros");
        Carro car=new Carro(seguradora,"Audi");
        Pessoa p=new Pessoa(car, "John");
//        System.out.println(obterNomeOptional(seguradora));
//        System.out.println(obterNomeOptional(new Seguradora()));
          getNomeSeguradora(Optional.of(p));
          getNomeSeguradora(Optional.ofNullable(null));
          checarNomeSeguradora(seguradora);
          checarNomeSeguradoraOptional(seguradora);
          checarNomeSeguradoraOptional(null);
    }
//    public static String obterNomeOptional(Seguradora seguradora){
////        System.out.println(Optional.ofNullable(seguradora).map(Seguradora::getNome));
//        System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("vazio"));
//        //O flatMap devolve um Optional<T> já o map devolve o T :D
//        return "";
//    }
    public static String getNomeSeguradora(Optional<Pessoa> p){
//        System.out.println(p
//                .flatMap(Pessoa::getCarro)
//                .flatMap(Carro::getSeguradora)
//                .map(Seguradora::getNome).orElse("Não informado"));
            System.out.println("* "+p
                    .flatMap(Pessoa::getCarro)
                    .flatMap(Carro::getSeguradora)
                    .map(Seguradora::getNome)
                    .orElse("Não informado"));
//                    .getClass().getSimpleName());
        return "";
    }
    public static String obterNome(Seguradora seguradora){
//        String nome=null;
        String nome="";
        if(seguradora.getNome()!=null){
//            nome=seguradora.getNome().map(seguradora::getNome);
        }
        return nome;
    }
    private static void checarNomeSeguradora(Seguradora seguradora){
        if(seguradora!=null&&seguradora.getNome().equals("DevDojo seguros")){
            System.out.println("DevDojo");
        }
    }
    private static void checarNomeSeguradoraOptional(Seguradora seguradora){
        Optional<Seguradora> seguradoraOptional=Optional.ofNullable(seguradora);
        seguradoraOptional.filter(s -> s.getNome().equals("DevDojo seguros"))
                .ifPresent(x-> System.out.println("He o DevDojo"));
    }
}
