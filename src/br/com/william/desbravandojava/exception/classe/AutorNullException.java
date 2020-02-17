/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.desbravandojava.exception.classe;

/**
 *
 * @author usuario
 */
public class AutorNullException extends RuntimeException {

    public AutorNullException() {
        super();
    }
    
    public AutorNullException(String msg) {
        super(msg);
    }
}
