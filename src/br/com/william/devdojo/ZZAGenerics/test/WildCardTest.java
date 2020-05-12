/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal implements Comparable<Cachorro>{

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }

    @Override
    public int compareTo(Cachorro t) {
        return 0;
    }
    
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
    
}
//Polimorfismo no Coringa não funciona
public class WildCardTest {
    public static void main(String[] args) {
        //type erase - O java limpa os Generics e troca por Object
        //Por isso na hora de compilação ele exige que seja aquele tipo e não um filho
        Cachorro[] dogs={
            new Cachorro(),
            new Cachorro()
        };
        Gato[] cats={
            new Gato(),
            new Gato()
        };
        
        consultarAnimais(dogs);
        consultarAnimais(cats);
        
        System.out.println("-------------");
        
        Animal[] animals={
            new Cachorro(),
            new Gato(),
            new Cachorro(),
            new Gato(),
        };
        List<Cachorro> dogsList=new ArrayList<Cachorro>();
        dogsList.add(new Cachorro());
        List<Gato> catsList=new ArrayList<Gato>();
        catsList.add(new Gato());
        //Erro de compilação List<Animal> aceita nessesariamente uma lista Animal
//        consultarAnimaisList(dogsList);
//        consultarAnimaisList(catsList);
        List<Animal> animalList=new ArrayList<Animal>();
        animalList.add(new Gato());
        animalList.add(new Gato());
        animalList.add(new Gato());
        consultarAnimaisList(catsList);
        consultarCachorrosList(animalList);
        
        ordena(dogsList);//Aceita apenas listas de objetos q implementam compareble
    }
    public static void consultarAnimais(Animal[] animals){
        for(Animal a:animals){
            a.consulta();
        }
    }
    //Só aceita Animal nada mais nem um filho!
    //Caractere coringa '?' faz com que aceite qualquer filho de Animal
    //prometendo que nada vai ser adicionado na list, já que a criatura
    //não reconhece se está sendo adicionado um tipo certo já
    //que as generics não vão para  álem do codigo.
    
    //? extends Animal aceita td que for List de um Animal porém não te permite adicionar nada
    // já que pode receber uma List Gato e adicionar um cachorro
    public static void consultarAnimaisList(List<? extends Animal> animals){
        for(Animal a:animals){
            a.consulta();
        }
//        animals.add(new Cachorro());
//        animals.add(new Gato());
        //As listas não tem recursos de reconhecimento no que tange adicionar
        //Elementos por meio de Polimorfismo
    }
    //Aceita adicionar apenas Cachorros e aceita Listas com tipo de Cachorro até SuperClasses do mesmo
    public static void consultarCachorrosList(List<? super Cachorro> cachorrosList){
     Cachorro dog=new Cachorro();
     Animal dog2=new Cachorro();//Não pode
     cachorrosList.add(dog);
//     cachorrosList.add(dog2);
     
//     cachorrosList.add(new Gato());
    }
    
    //É necessário o uso de extends até em interfaces
    //
    @SuppressWarnings("unchecked")
    public static void ordena(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
