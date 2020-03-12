/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class TestRuntimeException {
    public static void main(String[] args) {
        System.out.println(divisao(10, 12));
        try {
            // System.out.println(divisao(10, 0));
            // divisao(1, 0);
            multiCatch();
        } catch (IllegalArgumentException ex) {
        } catch (IOException ex) {
        } catch (SQLException ex) {
        }
    }
    private static double divisao(double a,double b) throws IllegalArgumentException{
        if(b==0)
            throw new IllegalArgumentException("denominador igual 0");
        return a/b;
    }
    public static void multiCatch() throws IllegalArgumentException, IOException, SQLException{
        try{
            lancaTudo();
        }catch(Exception ex){
            ex.printStackTrace();
            throw ex;
        }
    }
    public static void lancaTudo() throws IOException,SQLException,IllegalArgumentException{
        throw new SQLException("OI");
    } 
}
