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
public class ResolvendoPaths {//Juntar dois paths
    public static void main(String[] args) {
        Path path=Paths.get("pasta/subpasta");
        Path path2=Paths.get("pasta/subpasta/subsubpasta");
        Path result=path.resolve(path2);
        System.out.println(result);
    }
}
