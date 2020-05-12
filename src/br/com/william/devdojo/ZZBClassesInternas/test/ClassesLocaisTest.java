/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZBClassesInternas.test;

/**
 *
 * @author usuario
 */
public class ClassesLocaisTest {
    private String nome="john";
    public void fazAlgumaCoisa(){
        String test=" William";//No java7 é necessario utilizar final pois talves
        //a váriavel seje instinta e nossa classe ainda terá vida
/*final or abstract*/   class Interna{
            //No java8 é aceitavel que váriaveis externas sejem consideradas "efetivamente" finais
            //Ou seja sem nenhuma tentativa de alteração do seu valor
            public void imprimeNomeExterno(){
            //test=" vicente";local variables referenced from an inner class must be final or effectively final
                System.out.println(nome+test);//Ainda tem acesso aos atributos
            }
            
        }
        Interna in=new Interna();//Só pode ser instanceado no objeto
        in.imprimeNomeExterno();//Só pode ser chamada aqui
    }
    public static void main(String[] args) {
        ClassesLocaisTest externa= new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
    
}
