/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author usuario
 */
public class Normalizacao {
    public static void main(String[] args) {
        Path p1=Paths.get("pasta/subpasta","../");
        System.out.println(p1);
        System.out.println(p1.normalize());
    }
}
