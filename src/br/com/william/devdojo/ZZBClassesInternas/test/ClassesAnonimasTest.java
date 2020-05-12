/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZBClassesInternas.test;

import br.com.william.devdojo.ZZAGenerics.classes.Carro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author usuario
 */
class Animal{
    public void andar(){
        System.out.println("Andando");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a=new Animal(){//Classe anonima é executada em uma parte do código
            //Depois de usada ela é descartada
            @Override
            public void andar() {
                System.out.println("Andando ....");
            }
            
        };//Subclasse de Animal sem nome
        a.andar();
        
        List<Carro> listaCar=new ArrayList();
        listaCar.add(new Carro("GOL"));
        listaCar.add(new Carro("BMW"));
        listaCar.add(new Carro("Ferrari"));
        
        Collections.sort(listaCar,new  Comparator<Carro>(){
            @Override
            public int compare(Carro t, Carro t1) {
                return t.getNome().compareTo(t1.getNome());
            }
           //Top 
        });
//        Collections.sort(listaCar,(t,t1)->t.getNome().compareTo(t1.getNome()));
        System.out.println(listaCar);
    }
    
}
