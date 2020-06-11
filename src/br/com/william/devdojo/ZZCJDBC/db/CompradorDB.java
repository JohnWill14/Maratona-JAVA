/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.db;

import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import br.com.william.devdojo.ZZCJDBC.com.ConexaoFactory;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

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
    public void updatePreparedStatement(Comprador comp){
        if(comp==null)throw new IllegalArgumentException("Item nulo");
        if(comp.getId()==0)throw new IllegalArgumentException("ID não corresponde a nenhum item do banco");
        String sql="UPDATE comprador SET "         
                + "nome=?,cpf=? "
                + "WHERE "
                + "id= ?";
        
        try{
            Connection conn=ConexaoFactory.getConnection();
            PreparedStatement stm=conn.prepareStatement(sql);
            
            stm.setString(1, comp.getNome());
            stm.setString(2, comp.getCpf());
            stm.setInt(3, comp.getId() );
            
            
            int rows=stm.executeUpdate();
            
            System.out.println("linhas alteradas "+rows);
            
            ConexaoFactory.close(conn, stm);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void updateRowSet(Comprador comp){
        if(comp==null)throw new IllegalArgumentException("Item nulo");
        if(comp.getId()==0)throw new IllegalArgumentException("ID não corresponde a nenhum item do banco");
        String sql="SELECT * from comprador "
                + "WHERE "
                + "id= ?";
//        String sql="UPDATE comprador SET "         
//                + "nome=?,cpf=? "
//                + "WHERE "
//                + "id= ?";
        
        try{
            JdbcRowSet rowSet=ConexaoFactory.getRowSetConnection();
            rowSet.setCommand(sql);
            
            rowSet.setInt(1, comp.getId() );
            
            rowSet.execute();
            
            rowSet.next();
            rowSet.updateString("nome", comp.getNome().toUpperCase());
            rowSet.updateString("cpf", comp.getCpf().toUpperCase());
            rowSet.updateRow();
            
            ConexaoFactory.close(rowSet);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void updateRowSetCached(Comprador comp){
        if(comp==null)throw new IllegalArgumentException("Item nulo");
        if(comp.getId()==0)throw new IllegalArgumentException("ID não corresponde a nenhum item do banco");
        String sql="SELECT * from comprador "
                + "WHERE "
                + "id= ?";
//        String sql="UPDATE comprador SET "         
//                + "nome=?,cpf=? "
//                + "WHERE "
//                + "id= ?";
        
        try{
            CachedRowSet rowSet=ConexaoFactory.getRowSetConnectionCached();
            rowSet.setCommand(sql);
            
            rowSet.setInt(1, comp.getId() );
            
            rowSet.execute();
            
            rowSet.next();
            rowSet.updateString("nome", comp.getNome().toUpperCase());
            rowSet.updateString("cpf", comp.getCpf().toUpperCase());
            rowSet.updateRow();
            rowSet.acceptChanges();
//            ConexaoFactory.close(rowSet);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void excluir(int id){
        if(id==0)throw new IllegalArgumentException("ID não corresponde a nenhum item do banco");
        String sql="DELETE FROM comprador where id="+id;
        
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
    public List<Comprador> getAll(){
        
        return this.getAllByName("");
    }
    public List<Comprador> getAllByName(String name){
        String sql="select * from comprador WHERE nome LIKE '%"+name+"%';";
        List<Comprador> lista=null;
        try{
            Connection conn=ConexaoFactory.getConnection();
            Statement stm=conn.createStatement();
            
            ResultSet rs=stm.executeQuery(sql);
            lista=new ArrayList<>();
            Comprador comp;
            
            while(rs.next()){
                comp=new Comprador();
                comp.setId(rs.getInt("id"));
                comp.setCpf(rs.getString("cpf"));
                comp.setNome(rs.getString("nome"));
                
                lista.add(comp);
            }
            
            ConexaoFactory.close(conn, stm,  rs);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return lista;
    }
    public List<Comprador> getAllByNamePreparedStament(String name){
        String sql="select * from comprador WHERE nome LIKE ?;";
        List<Comprador> lista=null;
        try{
            Connection conn=ConexaoFactory.getConnection();
            PreparedStatement stm=conn.prepareStatement(sql);
            
            stm.setString(1, "%"+name+"%");
            
            ResultSet rs=stm.executeQuery();
            lista=new ArrayList<>();
            Comprador comp;
            
            while(rs.next()){
                comp=new Comprador();
                comp.setId(rs.getInt("id"));
                comp.setCpf(rs.getString("cpf"));
                comp.setNome(rs.getString("nome"));
                
                lista.add(comp);
            }
            
            ConexaoFactory.close(conn, stm,  rs);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return lista;
    }
    public List<Comprador> getAllByNameRowSet(String name){
        String sql="select * from comprador WHERE nome LIKE ?;";
        List<Comprador> lista=null;
        try{
            JdbcRowSet rowSet=ConexaoFactory.getRowSetConnection();
            rowSet.setCommand(sql);
            rowSet.setString(1, name);
            rowSet.execute();
            lista=new ArrayList<>();
            Comprador comp;
            
            while(rowSet.next()){
                comp=new Comprador();
                comp.setId(rowSet.getInt("id"));
                comp.setCpf(rowSet.getString("cpf"));
                comp.setNome(rowSet.getString("nome"));
                
                lista.add(comp);
            }
            
            ConexaoFactory.close(rowSet);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return lista;
    }
    public List<Comprador> getAllByNameCollableStatment(String name){
        String sql="CALL SP_GetCompradoresPorNome(?);";
        List<Comprador> lista=null;
        try{
            Connection conn=ConexaoFactory.getConnection();
            CallableStatement cs=conn.prepareCall(sql);
            
            cs.setString(1, "%"+name+"%");
            
            ResultSet rs=cs.executeQuery();
            lista=new ArrayList<>();
            Comprador comp;
            
            while(rs.next()){
                comp=new Comprador();
                comp.setId(rs.getInt("id"));
                comp.setCpf(rs.getString("cpf"));
                comp.setNome(rs.getString("nome"));
                
                lista.add(comp);
            }
            
            ConexaoFactory.close(conn, cs,  rs);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return lista;
    }
    public void selectMetaData(){
        String sql="select * from comprador";
        Connection conn=ConexaoFactory.getConnection();
        try{
            Statement stm=conn.createStatement();
            
            ResultSet rs=stm.executeQuery(sql);
            ResultSetMetaData rsm= (ResultSetMetaData) rs.getMetaData();
            
            rs.next();
            int collumn=rsm.getColumnCount();
            
            System.out.println("Numero de colunas: "+collumn);
            for (int i = 1; i <=collumn; i++) {
                System.out.println("tabela: "+rsm.getTableName(i)+" "+rsm.getColumnLabel(i)+" "+rsm.getColumnTypeName(i)+" size: "+rsm.getColumnDisplaySize(i));
            }
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    public void checkdriver(){
        Connection conn=ConexaoFactory.getConnection();
        try {
            DatabaseMetaData dmd = conn.getMetaData();
            
            if(dmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Suporta TYPE_FORWARD_ONLY");//Começar do inicio até o final TopDown
                if(dmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("Atualiza dados no resultSet. ResultSet.CONCUR_UPDATABLE");
                }
            }
            System.out.println("--------------------");
            if(dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");//Movimenta acima abaixo ou acessa determinada posição. Não é sincronizado com o banco
                if(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("Atualiza dados no resultSet. ResultSet.CONCUR_UPDATABLE");
                }
            }
            
            System.out.println("--------------------");
            if(dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");//Movimenta acima abaixo ou acessa determinada posição.  é sincronizado com o banco
                if(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("Atualiza dados no resultSet. ResultSet.CONCUR_UPDATABLE");
                }
            }
            
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void testTypeScroll(){
        
        String sql="select id,nome,cpf from comprador; ";
        
        Connection conn=ConexaoFactory.getConnection();
        try {
            
            Statement stm;
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            
            
            if(rs.last()){//Ultima linha
                //Leva o cursor realmente para a ultima linha
                Comprador cp=new Comprador(rs.getInt(1), rs.getString(3), rs.getString(2));
                exibeCompradorBeaultiful(cp);
                
                System.out.println(" Ultima linha: "+rs.getRow()+"\n");
            }
            if(rs.first()){//Primeira linha
                //Leva o cursor realmente para a primeira linha
                Comprador cp=new Comprador(rs.getInt(1), rs.getString(3), rs.getString(2));
                exibeCompradorBeaultiful(cp);
                System.out.println(" Primeira linha: "+rs.getRow()+"\n");
                
            }
            if(rs.absolute(4)){//linha 4
                //Leva o cursor realmente para a quarta linha
                Comprador cp=new Comprador(rs.getInt(1), rs.getString(3), rs.getString(2));
                exibeCompradorBeaultiful(cp);
                System.out.println(" Quarta linha: "+rs.getRow()+"\n");
                
            }
            if(rs.relative(-1)){//move em relação a linha que vc está
                //Leva o cursor realmente para a linha cujo referencial era a linha anterior
                Comprador cp=new Comprador(rs.getInt(1), rs.getString(3), rs.getString(2));
                exibeCompradorBeaultiful(cp);
                System.out.println(" Terceira linha: "+rs.getRow()+"\n");
                
            }
            
            System.out.println("\n\n");
            System.out.println("Primeira linha: "+rs.isFirst());
            System.out.println("Ultima linha: "+rs.isLast());
            
            System.out.println("Ordem inversa:\n");
            rs.afterLast();//Depois do ultimo
            while(rs.previous()){
                Comprador cp=new Comprador(rs.getInt(1), rs.getString(3), rs.getString(2));
                System.out.println(cp);
            }
            ConexaoFactory.close(conn, stm, rs);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    public static void exibeCompradorBeaultiful(Comprador cp){
        System.out.println("----------------\n Registro: "+cp.getId());
        System.out.println(" Nome: "+cp.getNome().toUpperCase()+"");
        System.out.println(" CPF: "+cp.getCpf());
    }
    
    public void updateNameToLowerCase(){
        String sql="select id,nome,cpf from comprador; ";
        
        Connection conn=ConexaoFactory.getConnection();
        
        Statement stm;
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("");
            System.out.println("Upddate detected: "+metaData.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("Insert detected: "+metaData.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("Delete detected: "+metaData.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("\n");
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(sql);
            
            
            
            while(rs.next()){
                rs.updateString(2, rs.getString("nome").toLowerCase());//Modifica o campo mais não é aconselhado chamar mais de uma vez
//                rs.cancelRowUpdates(); Utilizado para cancelar a alteração de um campo não surti efeito depois do updateRow
                rs.updateRow();//Atualiza no banco
                
//                if(rs.rowUpdated())System.out.println("Atualizada linha: "+rs.getRow());
            }
            rs.beforeFirst();
            while(rs.next()){
                    System.out.println(rs.getString("nome"));
            }
            
            rs.absolute(2);
            System.out.println("\n\nInsercao");
            String nome=rs.getString("nome");
            
            rs.moveToInsertRow();
//            System.out.println(nome);
//            System.out.println(rs.getString("nome"));

            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "111.111.111-11");
//            rs.insertRow();
            rs.moveToCurrentRow();//move para a posição anterior do resultSet
            
            System.out.println(rs.getString("nome")+" row: "+rs.getRow());
            
            rs.absolute(4);
            rs.deleteRow();
            ConexaoFactory.close(conn, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(CompradorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void updateNameToUpperCase(){
        String sql="select id,nome,cpf from comprador; ";
        
        Connection conn=ConexaoFactory.getConnection();
         
        Statement stm;
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                rs.updateString(2, rs.getString("nome").toUpperCase());//Atualiza no banco
                rs.updateRow();
                
            }
            rs.beforeFirst();
            while(rs.next()){
                    System.out.println(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompradorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        
    }
}
