/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.dao;

import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class CompradorDao implements IDAO<Comprador>{
    private Connection em;
    @Override
    public boolean save(Comprador object) {
        em=getConnection();
        String sql="Insert Into comprador(nome,cpf) "
                + "values (?,?);";
        
        PreparedStatement stm;
        boolean bool=false;
        try {
            stm = em.prepareStatement(sql);
            stm.setString(1, object.getNome());
            stm.setString(2, object.getCpf());

            stm.execute();
            
            bool=true;
            ConexaoFactory.close(em, stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return bool;
    }

    @Override
    public boolean update(Comprador object) {
        em=getConnection();
        String sql="select * from comprador "
                + "where id= "+object.getId()+";";
        
        Statement stm;
        boolean bool=false;
        try {
            stm = em.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            

            ResultSet rs=stm.executeQuery(sql);
            
            rs.next();
            
            rs.updateString("nome", object.getNome());
            rs.updateString("cpf", object.getCpf());
            
            rs.updateRow();
            
            bool=true;
            ConexaoFactory.close(em, stm, rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return bool;
    }

    @Override
    public boolean remove(Comprador object) {
         em=getConnection();
        String sql="delete  from comprador "
                + "where id= ? ";
        
        PreparedStatement stm;
        boolean bool=false;
        try {
            stm = em.prepareStatement(sql);
            stm.setInt(1, object.getId());

            stm.execute();
            
           
            
            bool=true;
            ConexaoFactory.close(em, stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return bool;
    }

    @Override
    public boolean remove(Integer id) {
      try{
            if(id==null)throw new IllegalArgumentException("id nulo");
        remove(getById(id));
      }catch(Exception ex){
          return false;
      }
        return true;
    }

    @Override
    public List<Comprador> getAll() {
        return getAll("");
    }
    public List<Comprador> getAll(String str) {
         em=getConnection();
        String sql="select * from comprador where nome like ?; ";
        
        PreparedStatement stm;
        Comprador comp=null;
        List<Comprador> lista=null;
        try {
            stm = em.prepareStatement(sql);
            stm.setString(1, "%"+str+"%");

            ResultSet rs=stm.executeQuery();
            lista=new ArrayList<>();
            while(rs.next()){
                comp=new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"));
                lista.add(comp);
            }
            
            
            ConexaoFactory.close(em, stm, rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return lista;
    }

    @Override
    public Comprador getById(Integer id) {
        if(id==null)throw new IllegalArgumentException("id nulo");
         em=getConnection();
        String sql="select * from comprador "
                + "where id= ? limit 1;";
        
        PreparedStatement stm;
        Comprador comp=null;
        try {
            stm = em.prepareStatement(sql, ResultSet.CONCUR_UPDATABLE);
            stm.setInt(1, id);

            ResultSet rs=stm.executeQuery();
            
            rs.next();
            
            comp=new Comprador(id, rs.getString("cpf"), rs.getString("nome"));
            
            
            ConexaoFactory.close(em, stm, rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return comp;
    }

    @Override
    public Connection getConnection() {
        return ConexaoFactory.getConnection();
    }
    
}
