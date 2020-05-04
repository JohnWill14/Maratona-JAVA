/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Zcolections.test;

import br.com.william.devdojo.Zcolections.classe.Celular;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular=new Celular("lg", "1234");
        Celular celular1=new Celular("iphone", "1324");
        Celular celular2=new Celular("capslook", "3412");
        
        List<Celular> lista=new ArrayList();
        lista.add(celular);
        lista.add(celular1);
        lista.add(celular2);
        
        
        for(Celular cel:lista)System.out.println(cel.getNome()+" "+cel.getIME());
        Celular celular4=new Celular("Galaxi", "123456");
        System.out.println(lista.contains(celular4));
    }
}
