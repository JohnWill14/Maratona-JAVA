/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.classe;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class ComparadorCarro {
    public static int compareByColor(Carro car,Carro car2){
        return car.getCor().compareTo(car2.getCor());
    }
    public  int compareByAno(Carro car,Carro car2){
        return ((Integer)car.getAno()).compareTo(((Integer)car2.getAno()));
    }
}
