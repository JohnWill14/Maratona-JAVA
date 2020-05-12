/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZAGenerics.test;

import br.com.william.devdojo.ZZAGenerics.classes.Carro;
import br.com.william.devdojo.ZZAGenerics.classes.Computador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugado alugavel=new CarroAlugado();
        
        Carro car=alugavel.getAlugavel();
        System.out.println("\nUsando por umm mês:\n");
        alugavel.devolveAlugavel(car);
        System.out.println("\n-------------------------------\n");
        ComputadorAlugavel compAluguel=new ComputadorAlugavel();
        
        Computador c=compAluguel.getAlugavel();
        System.out.println("\nUsando até conseguir outro\n");
        compAluguel.devolveAlugavel(c);
        
        Alugavel<Carro> carLista=new Alugavel<>();
       
    }
}
//T Type
 class Alugavel<T>{
    private List<T> disponiveis;
    
    {
       disponiveis=new ArrayList<>();
    }

    public Alugavel() {
    }
    public Alugavel(List<T> lista) {
        disponiveis=lista;
    }

    
    public List<T> getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(List<T> disponiveis) {
        this.disponiveis = disponiveis;
    }
    
    //Aluga carro
    public T getAlugavel(){
        T c=disponiveis.remove(0);
        System.out.println("Alugando: "+c);
        listarDisponiveis();
        return c;
    }
    public void devolveAlugavel(T c){
        System.out.println("Devolvendo: "+c);
        disponiveis.add(c);
        listarDisponiveis();
    }
    private  void listarDisponiveis(){
        System.out.println("Disponiveis: \n"+disponiveis);
    }
}
class CarroAlugado extends Alugavel<Carro>{
    {
        this.getDisponiveis().add(new Carro("Gol"));
        this.getDisponiveis().add(new Carro("BMW"));
        this.getDisponiveis().add(new Carro("Ferrari"));
        this.getDisponiveis().add(new Carro("Mercedez"));
    }
//    private List<Carro> carrosDisponiveis;
//    
//    {
//       carrosDisponiveis=new ArrayList<>();
//       carrosDisponiveis.add(new Carro("Gol"));
//       carrosDisponiveis.add(new Carro("BMW"));
//    }
//    
//    //Aluga carro
//    public Carro getCarro(){
//        Carro c=carrosDisponiveis.remove(0);
//        System.out.println("Alugando carro: "+c);
//        listarCarrosDisponiveis();
//        return c;
//    }
//    public void devolveCarro(Carro c){
//        System.out.println("Devolvendo carro: "+c);
//        carrosDisponiveis.add(c);
//        listarCarrosDisponiveis();
//    }
//    private  void listarCarrosDisponiveis(){
//        System.out.println("Carros disponiveis: \n"+carrosDisponiveis);
//    }
}

class ComputadorAlugavel extends Alugavel<Computador>{
    {
        Computador comp=new Computador("Inspiron", 2000.00d, "Dell");
        Computador comp1=new Computador("Inspiron 123", 2500.00d, "Dell");
        Computador comp2=new Computador("Inspiron 321", 4000.00d, "Dell");
        Computador comp3=new Computador("MacBook", 10000.00d, "Apple");
        
        this.getDisponiveis().add(comp);
        this.getDisponiveis().add(comp1);
        this.getDisponiveis().add(comp2);
        this.getDisponiveis().add(comp3);
    }
}