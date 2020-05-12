/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.db;

import br.com.william.devdojo.ZZCJDBC.Comprador;
import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class CompradorDB {
    
    public void save(Comprador comp){
        if(comp==null)throw new IllegalArgumentException("Item nulo");
        
        String sql="INSERT INTO "
                + "comprador"
                + "(nome,cpf) "
                + "VALUES "
                + "('"+comp.getNome()+"','"+comp.getCpf()+"');";
        
        try{
            Connection conn=ConexaoFactory.getConnection();
            Statement stm=conn.createStatement();
            
            
            int rows=stm.executeUpdate(sql);
            
            System.out.println("linhas alteradas "+rows);
            
            ConexaoFactory.close(conn, stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void update(Comprador comp){
        if(comp==null)throw new IllegalArgumentException("Item nulo");
        if(comp.getId()==0)throw new IllegalArgumentException("ID não corresponde a nenhum item do banco");
        String sql="UPDATE comprador SET "         
                + "nome='"+comp.getNome()+"',cpf='"+comp.getCpf()+"' "
                + "WHERE "
                + "id= "+comp.getId();
        
        try{
            Connection conn=ConexaoFactory.getConnection();
            Statement stm=conn.createStatement();
            
            
            int rows=stm.executeUpdate(sql);
            
            System.out.println("linhas alteradas "+rows);
            
            ConexaoFactory.close(conn, stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) {
        
    }
}
