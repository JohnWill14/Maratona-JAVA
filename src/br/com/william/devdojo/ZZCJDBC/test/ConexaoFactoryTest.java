/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.test;

import br.com.william.devdojo.ZZCJDBC.Comprador;
import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import br.com.william.devdojo.ZZCJDBC.db.CompradorDB;

/**
 *
 * @author usuario
 */
public class ConexaoFactoryTest {
    public static void main(String[] args) {
       String str= ConexaoFactory.getConnection().toString();
        System.out.println(str);
        
        CompradorDB compDb=new CompradorDB();
        
//        compDb.save(new Comprador( "666.785.984-89","humberto"));
        compDb.update(new Comprador( 6,"666.785.984-89","humberto"));
    }
}
