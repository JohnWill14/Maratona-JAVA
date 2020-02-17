/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.exception.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            new FileInputStream("johnCena.txt");
        }catch(FileNotFoundException e){
            throw new FileNotFoundException("Deu ruim");
        }
    }
}
