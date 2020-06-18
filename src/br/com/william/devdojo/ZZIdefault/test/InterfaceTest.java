/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZIdefault.test;

import br.com.william.devdojo.ZZIdefault.interfaces.A;
import br.com.william.devdojo.ZZIdefault.interfaces.B;
import br.com.william.devdojo.ZZIdefault.interfaces.MyList;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class InterfaceTest implements MyList<String>, A, B{
    public static void main(String[] args) {
        MyList.sort();
        List<String> lista=new LinkedList<>();
       
        InterfaceTest inter=new InterfaceTest();
        inter.add(lista, "DevDojo");
        inter.add(lista, "William");
        inter.add(lista, "Suane");
        System.out.println(lista);
        inter.pedirDitadura();
    }

    @Override
    public void votar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   

   
}
