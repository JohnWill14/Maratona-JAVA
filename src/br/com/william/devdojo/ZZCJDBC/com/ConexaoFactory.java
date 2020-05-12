/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        if(conn==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/"+URL,NOME,PASS);
//                conn.setAutoCommit(false);
            } catch (SQLException ex) {
                throw new  RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new  RuntimeException(ex);
            }
        }
        return conn;
    }
    public static void close(Connection conn){
        try {
            if(conn!=null)
                conn.close();
        } catch (SQLException ex) {
           throw new  RuntimeException(ex);
        }
    }
    public static void close(Connection conn,Statement stm){
        try {
            if(stm!=null)
                stm.close();
        } catch (SQLException ex) {
           throw new  RuntimeException(ex);
        }
        close(conn);
    }
    
}
