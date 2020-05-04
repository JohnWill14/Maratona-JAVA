/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Produto;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author usuario
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> listaProdutos=new LinkedList<>();
        Produto produto1=new Produto(1L, "knife", 35.78, 23);
        Produto produto2=new Produto(2L, "macBook", 56.78, 0);
        Produto produto3=new Produto(3L, "nokia tijolão", 115d, 0);
        Produto produto4=new Produto(4L, "mario kart", 225.78, 3);
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        //Serve pra percorrer a list sem dar chilique
        Iterator<Produto> iterator=listaProdutos.iterator();
        
        while(iterator.hasNext()){
            Produto pro=iterator.next();
            if(pro.getQuantidade()==0){
                System.out.println("Removido");
                iterator.remove();
            }else
            System.out.println(pro);
        }
        System.out.println("Size: "+listaProdutos.size());
    }
}
