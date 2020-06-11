/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface IDAO<T> {
    boolean save(T object);
    boolean update(T object);
    boolean remove(T object);
    boolean remove(Integer id);
    List<T> getAll();
    T getById(Integer id);
    Connection getConnection();
}
