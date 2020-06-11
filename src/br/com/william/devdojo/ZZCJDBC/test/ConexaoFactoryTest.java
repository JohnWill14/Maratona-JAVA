/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.test;

import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import br.com.william.devdojo.ZZCJDBC.db.CompradorDB;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ConexaoFactoryTest {
    public static void main(String[] args) {
       String str= ConexaoFactory.getConnection().toString();
        System.out.println(str);
        
        CompradorDB compDb=new CompradorDB();
//        atualizaNoBanco(compDb);
//        updatePreparedStatment(compDb);
        updateRowSetCached(compDb);
        selectAllPrepared(compDb);
    }
    
    public static void save(CompradorDB compDb){
        
        compDb.save(new Comprador( "111.111.222-49","Mari"));
        compDb.save(new Comprador( "696.721.444-69","Shina"));
    }
    public static void update(CompradorDB compDb){
        
        compDb.update(new Comprador( 6,"666.785.984-89","humberto"));
    }
    public static void updatePreparedStatment(CompradorDB compDb){
        
        compDb.update(new Comprador( 11,"666.785.984-89","Mari"));
    }
    
    public static void updateRowSet(CompradorDB compDb){
        
        compDb.updateRowSet(new Comprador( 1,"666.785.984-89","Mari"));
    }
    public static void updateRowSetCached(CompradorDB compDb){
        
        compDb.updateRowSetCached(new Comprador( 1,"566.785.984-89","Mari"));
    }
    
    public static void excluir(CompradorDB compDb){
        
        compDb.excluir(7);
         compDb.excluir(8);
    }
    
    public static void selectAll(CompradorDB compDb){
        
       List<Comprador> lista=compDb.getAllByName(new Scanner(System.in).next());
        System.out.println("-----------------");
        System.out.println("ID   - NOME  - CPF");
        if(lista.size()==0)System.out.println("\n\tNenhum item encontrado\n");
        else
            for(Comprador c:lista){
                System.out.println(c.getId()+" - "+c.getNome()+" - "+c.getCpf());
            }
    }
    public static void selectAllPrepared(CompradorDB compDb,String find){
        //SQLINJECTOR
//       List<Comprador> lista=compDb.getAllByNamePreparedStament("ao1' or 'X'='X");
       List<Comprador> lista=compDb.getAllByNamePreparedStament(find);
        System.out.println("-----------------");
        System.out.println("ID   - NOME  - CPF");
        if(lista.size()==0)System.out.println("\n Nenhum item encontrado\n");
        else
            for(Comprador c:lista){
                System.out.println(c.getId()+" - "+c.getNome()+" - "+c.getCpf());
            }
    }
    public static void selectAllRowSet(CompradorDB compDb,String find){
        //SQLINJECTOR
//       List<Comprador> lista=compDb.getAllByNamePreparedStament("ao1' or 'X'='X");
       List<Comprador> lista=compDb.getAllByNameRowSet(find);
        System.out.println("-----------------");
        System.out.println("ID   - NOME  - CPF");
        if(lista.size()==0)System.out.println("\n Nenhum item encontrado\n");
        else
            for(Comprador c:lista){
                System.out.println(c.getId()+" - "+c.getNome()+" - "+c.getCpf());
            }
    }
    public static void selectCallable(CompradorDB compDb,String find){
        //SQLINJECTOR
//       List<Comprador> lista=compDb.getAllByNamePreparedStament("ao1' or 'X'='X");
       List<Comprador> lista=compDb.getAllByNamePreparedStament(find);
        System.out.println("-----------------");
        System.out.println("ID   - NOME  - CPF");
        if(lista.size()==0)System.out.println("\n Nenhum item encontrado\n");
        else
            for(Comprador c:lista){
                System.out.println(c.getId()+" - "+c.getNome()+" - "+c.getCpf());
            }
    }
    public static void selectAllPrepared(CompradorDB compDb){
        selectAllPrepared(compDb, "");
    }
    
    public static void selectMetaData(CompradorDB compDb){
        
       compDb.selectMetaData();
    }
    public static void check(CompradorDB compDb){
        compDb.checkdriver();
    }
    
    public static void tyoeScrool(CompradorDB compDb){
        compDb.testTypeScroll();
    }
    public static void atualizaNoBanco(CompradorDB compDb){
        compDb.updateNameToLowerCase();
    }
}
