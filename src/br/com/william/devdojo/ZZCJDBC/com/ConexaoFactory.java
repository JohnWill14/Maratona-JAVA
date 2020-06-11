/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author usuario
 */
public class ConexaoFactory {
    /*
        java.sql-
            * Connection: Conectar com o banco;
            * Statement: Realiza alterações na tabela além de consultas;
            * ResultSet: Realiza a varedura de tables.
    */
    
    //DriverManager busca o driver e depois devolve uma conexão.
    
    private final static String NOME;
    private final static String URL;
    private final static String PASS;
    private static Connection conn;
    static{
        NOME="usermysql";
        URL="agencia";
        PASS="cursomysql";
        conn=null;
    }
    public static Connection getConnection(){
        try {
            if(conn==null||conn.isClosed()){
                
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost/"+URL,NOME,PASS);
                conn.setAutoCommit(false);
                 
            }
        }catch (SQLException ex) {
            throw new  RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new  RuntimeException(ex);
        }
        return conn;
    }
    
    public static JdbcRowSet getRowSetConnection(){
        JdbcRowSet rowSet=null;
        try {
            if(rowSet==null||rowSet.isClosed()){
                
//                    Class.forName("com.mysql.jdbc.Driver");;
                   rowSet=  RowSetProvider.newFactory().createJdbcRowSet();
                   rowSet.setUrl("jdbc:mysql://localhost/"+URL);
                   rowSet.setUsername(NOME);
                   rowSet.setPassword(PASS);
                   rowSet.addRowSetListener(new MyRowSetListener());
            }
        }catch (SQLException ex) {
            throw new  RuntimeException(ex);
        } 
        return rowSet;
    }
    public static CachedRowSet getRowSetConnectionCached(){
        CachedRowSet rowSet=null;
        try {
            
//                    Class.forName("com.mysql.jdbc.Driver");;
                   rowSet=  RowSetProvider.newFactory().createCachedRowSet();
                   rowSet.setUrl("jdbc:mysql://localhost/"+URL+"?relaxAutoCommit=true");
                   rowSet.setUsername(NOME);
                   rowSet.setPassword(PASS);
//                   rowSet.addRowSetListener(new MyRowSetListener());
                   
            
        }catch (SQLException ex) {
            throw new  RuntimeException(ex);
        } 
        return rowSet;
    }
    public static void close(Connection conn){
        
        try {
            if(conn!=null){
                conn.commit();
                conn.close();
            }
        } catch (SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
           throw new  RuntimeException(ex);
        }
    }
    public static void close(Connection conn,Statement stm){
        
        close(conn);
        try {
            if(stm!=null)
                stm.close();
        } catch (SQLException ex) {
           throw new  RuntimeException(ex);
        }
    }
    public static void close(Connection conn,Statement stm,ResultSet rs){
        
        close(conn,stm);
        try {
            if(rs!=null)
                rs.close();
        } catch (SQLException ex) {
           throw new  RuntimeException(ex);
        }
    }
    public static void close(RowSet rowSet){
        try {
            if(rowSet!=null)
                rowSet.close();
        } catch (SQLException ex) {
           throw new  RuntimeException(ex);
        }
    }
    
    
}
