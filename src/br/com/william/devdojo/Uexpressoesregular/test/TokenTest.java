/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Uexpressoesregular.test;

/**
 *
 * @author usuario
 */
public class TokenTest {
    public static void main(String[] args) {
        String test="John 55 hellow word papapa joana";
        String[] arrays=test.split("\\s");
        for(String s:arrays){
            System.out.println(s);
        }
    }
}
