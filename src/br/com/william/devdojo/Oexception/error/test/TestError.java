/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.error.test;

/**
 *
 * @author usuario
 */
public class TestError {
    public static void main(String[] args) {
        stackOverflowError();
    }
    public static void stackOverflowError(){
        
        stackOverflowError();
    }
}
