/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZHLambdas.interfaces;

import java.util.List;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
@FunctionalInterface
public interface CarroPredicate<T> {
    boolean test(T objeto);
}
