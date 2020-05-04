/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.test;

import br.com.william.devdojo.ZZcolections.classe.Celular;
import br.com.william.devdojo.ZZcolections.classe.Produto;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class TreeSetTest {
    public static void main(String[] args) {
       
        
        Produto produto1=new Produto(5L, "Wathsapp", 0d, 0);
        Produto produto2=new Produto(2L, "Veja", 56.78, 0);
        Produto produto3=new Produto(3L, "nokia tijolão", 115d, 0);
        Produto produto4=new Produto(4L, "mario kart", 225.78, 3);
        Celular celular=new Celular("Iphone","132");
        
        //No HasSet é ordenado sem vc entender já no TreeSet já são todos ordenados Muito Bacana
        
        //Enquanto o LinkedHashSet permanece a ordem o TreeSet já Ordena 
        NavigableSet<Produto> listaProdutos=new TreeSet<>();
        //Ou a classe implementa comparator ou senão tu cria um Comparator para ela
        NavigableSet<Celular> listaCelular=new TreeSet<>(new Celular.CelularComparatorByName());
        
        //É obrigatório implementar compareble para adicionar itens na lista
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto4);
        
        //Converte Objeto em Compareble se não poder ser convertido da ruim
        listaCelular.add(celular);
        
//        for(Celular cel:listaCelular){
//            System.out.println(cel);
//        }
        for(Produto pro:listaProdutos){
            System.out.println(pro);
        }
        System.out.println("==================");
        
        //lower <
        //floor <=
        //higher >
        //ciling >=
        
        //Devolve o produto menor do que o passado
        System.out.println(listaProdutos.lower(produto3));
        
        //Devolve o produto menor/igual do que o passado
        System.out.println(listaProdutos.floor(produto3));
        
        
        //Devolve o produto imediatamente maior do que o passado
        System.out.println(listaProdutos.higher(produto2));
        
        //Devolve o produto imediatamente maior/igual do que o passado
        System.out.println(listaProdutos.ceiling(produto2));
        
        System.out.println("==================\nReversse ordem\n");
        for(Produto pro:listaProdutos.descendingSet()){
            System.out.println(pro);
        }
        
        System.out.println("==================\nOuthers:\n");
        System.out.println("Size: "+listaProdutos.size());
        System.out.println(listaProdutos.pollFirst());//Devolve o primeiro objeto e o remove
        System.out.println(listaProdutos.pollLast());//Devolve o ultimo objeto e o remove
        System.out.println("Size: "+listaProdutos.size());
    }
}
