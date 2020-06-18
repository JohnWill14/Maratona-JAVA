/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZGcomportamentoporparametro.test;

import br.com.william.devdojo.ZZGcomportamentoporparametro.classe.Carro;
import br.com.william.devdojo.ZZGcomportamentoporparametro.classe.Cores;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
import java.util.Calendar;
import br.com.william.devdojo.ZZGcomportamentoporparametro.interfaces.CarroPredicate;
import java.util.function.Predicate;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class CarroTest {
    public static List<Carro> filtrarCarroByCor(Cores cor, List<Carro> lista){
        List<Carro> result=new ArrayList<>();
        for(Carro car:lista){
            if(car.getCor()==cor)result.add(car);
        }
        return result;
    }
    public static List<Carro> filtrarCarrosPorAnoDeFabricacao(List<Carro> lista){
        List<Carro> result=new ArrayList<>();
        for(Carro car:lista){
            if(car.getAno()>Calendar.getInstance().get(Calendar.YEAR)-10)result.add(car);
        }
        return result;
    }
    public static List<Carro> filtrarCarro(List<Carro> lista, CarroPredicate<Carro> filtro){
        List<Carro> result=new ArrayList<>();
        for(Carro car:lista){
            if(filtro.test(car))result.add(car);
        }
        return result;
    }
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> predicate){
        List<T> result=new ArrayList<>();
        for(T e:lista){
            if(predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Carro> carros=asList(new Carro(Cores.ROSA, 2020), new Carro(Cores.AZUL, 2020), new Carro(Cores.CINZA, 2020), new Carro(Cores.VERDE, 2020));
        System.out.println(filtrarCarroByCor(Cores.VERDE, carros));
        System.out.println(filtrarCarroByCor(Cores.ROSA, carros));
        System.out.println(filtrarCarrosPorAnoDeFabricacao(carros));
        System.out.println(filtrarCarro(carros,new CarroPredicate<Carro>() {
            @Override
            public boolean test(Carro objeto) {
                return objeto.getCor()==Cores.AZUL;
            }
        }));
        
        System.out.println(filtrar(carros, new Predicate<Carro>() {
            @Override
            public boolean test(Carro t) {
                return t.getAno()>2010;
            }
        }));
        
        List<Integer> numero=asList(1,2,3,4,5,6,7,8,9,10);
        
        System.out.println(filtrar(numero, (Integer n)-> n%2==0));
       
    }
}
