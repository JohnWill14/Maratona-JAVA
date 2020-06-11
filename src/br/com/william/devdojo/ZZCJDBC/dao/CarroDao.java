/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.dao;

import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import br.com.william.devdojo.ZZCJDBC.model.Carro;
import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class CarroDao implements IDAO<Carro>{
    private CompradorDao daoComprador=new CompradorDao();
    @Override
    public boolean save(Carro object) {
        String sql="INSERT INTO carro(nome,placa,comprador) "
                + "values(?,?,?);";
        Carro car;
        
        try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
            stm.setString(1, object.getNome());
            stm.setString(2, object.getPlaca());
            stm.setInt(3,object.getComprador().getId());
            
            stm.execute();
           
            conn.commit();
            ConexaoFactory.close(conn,stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }

    @Override
    public boolean update(Carro object) {
        String sql="update carro set nome=? ,placa=? ,comprador=? "
                + "where id=?";
        Carro car;
        
       try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
            stm.setString(1, object.getNome());
            stm.setString(2, object.getPlaca());
            stm.setInt(3,object.getComprador().getId());
            stm.setInt(4,object.getId());
            
           
            stm.executeUpdate();
            conn.commit();
            ConexaoFactory.close(conn,stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }

    @Override
    public boolean remove(Carro object) {
        String sql="delete from carro "
                + "where id= ?";
        
        
        try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
           
            stm.setInt(1,object.getId());
            
           stm.execute();
            conn.commit();
            ConexaoFactory.close(conn,stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }

    @Override
    public boolean remove(Integer id) {
        remove(getById(id));
        return true;
    }

    @Override
    public List<Carro> getAll() {
        String sql="select "
                + "carro.id,carro.nome,carro.placa,comprador.id as 'idComp',"
                + "comprador.nome as 'nomeComp',comprador.cpf as 'cpfComp' "
                + "from carro inner join comprador on comprador.id=carro.comprador; ";
//        System.out.println(sql);
        List<Carro> listaCarro;
        Carro car;
        try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
           
            
           ResultSet rs=stm.executeQuery();
           listaCarro=new ArrayList<>();
           
           while(rs.next()){
            Comprador comp= new  Comprador();
            comp.setId(rs.getInt("idComp"));
            comp.setNome(rs.getString("nomeComp"));
            comp.setCpf(rs.getString("cpfComp"));
              car=new Carro(rs.getInt("id"), rs.getString("nome"),rs.getString("placa"),comp);
              listaCarro.add(car);
           }
           
           
            ConexaoFactory.close(conn,stm,rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return listaCarro;
    }
    public List<Carro> getAll(String str) {
        String sql="select "
                + "carro.id,carro.nome,carro.placa,comprador.id as 'idComp',"
                + "comprador.nome as 'nomeComp',comprador.cpf as 'cpfComp' "
                + "from carro inner join comprador on comprador.id=carro.comprador "
                + "where carro.nome like ?; ";
//        System.out.println(sql);
        List<Carro> listaCarro;
        Carro car;
        try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
           stm.setString(1, "%"+str+"%");
            
           ResultSet rs=stm.executeQuery();
           listaCarro=new ArrayList<>();
           
           while(rs.next()){
            Comprador comp= new  Comprador();
            comp.setId(rs.getInt("idComp"));
            comp.setNome(rs.getString("nomeComp"));
            comp.setCpf(rs.getString("cpfComp"));
              car=new Carro(rs.getInt("id"), rs.getString("nome"),rs.getString("placa"),comp);
              listaCarro.add(car);
           }
           
           
            ConexaoFactory.close(conn,stm,rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return listaCarro;
    }

    @Override
    public Carro getById(Integer id) {
        String sql="SELECT * FROM carro"
                + " inner join comprador on comprador.id=carro.comprador "
                + " WHERE id=? ";
        Carro car;
        
        try(Connection conn=getConnection();
                PreparedStatement stm=conn.prepareStatement(sql);
            ) {
            
            stm.setInt(1, id);
            
            ResultSet rs=stm.executeQuery();
            rs.next();
            
            Comprador comp= new  Comprador();
            comp.setId(rs.getInt("idComp"));
            comp.setNome(rs.getString("nomeComp"));
            comp.setCpf(rs.getString("cpfComp"));
            
            car=new Carro(rs.getInt("id"), rs.getString("nome"),rs.getString("placa"),comp);
            
           ConexaoFactory.close(getConnection(),stm,rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return car;
    }
   private Comprador comp(int id){
       if(id==0)throw new IllegalArgumentException("id nulo");
       Connection em;
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
            
            rs.close();
            stm.close();
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
