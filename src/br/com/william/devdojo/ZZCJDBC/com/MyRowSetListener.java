/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.com;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

/**
 *
 * @author usuario
 */
public class MyRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent rse) {
        System.out.println("Comando execute executado");
    }

    @Override
    public void rowChanged(RowSetEvent rse) {
        System.out.println("Linha foi atualizada inserida ou deletada");
        if(rse.getSource() instanceof RowSet){
            try {
                ((RowSet)rse.getSource()).execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent rse) {
        System.out.println("Cursor moveu");
    }
    
}
