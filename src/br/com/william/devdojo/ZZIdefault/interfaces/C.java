/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZIdefault.interfaces;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class C implements A,B{
    public static void main(String[] args) {
        new C().pedirDitadura();
    }
    @Override
    public void votar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
