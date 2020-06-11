    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZEconcorrencia.test;

/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class ConcorrenciaTest {
    public static void main(String[] args) throws InterruptedException {
        Contador c=new Contador();
        Incrementador i=new Incrementador(c);
        Incrementador i2=new Incrementador(c);
        i.start();
        i2.start();
        i.join();
        i2.join();
        
        System.out.println(c.getCount());
        System.out.println(c.getC());
    }
}
