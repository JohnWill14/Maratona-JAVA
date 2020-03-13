/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.checkedexception.teste;

import br.com.william.devdojo.Oexception.checkedexception.classes.Funcionario;
import br.com.william.devdojo.Oexception.checkedexception.classes.Pessoa;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;

/**
 *
 * @author usuario
 */
public class TestSobrescritaComException {
    public static void main(String[] args) {
        Funcionario f=new Funcionario();
         Pessoa p=new Pessoa();
        f.salvar();
        try {
            p.salvar();
        } catch (LoginException ex) {
            Logger.getLogger(TestSobrescritaComException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSobrescritaComException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
