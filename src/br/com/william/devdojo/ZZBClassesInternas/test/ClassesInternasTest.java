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
public class ClassesInternasTest {
    public static void main(String[] args) {
        //Primeiro um objeto da classe externa e depois chamar a classe interna
        new Externa().getInterna().mostraNome();
        
        Externa ex=new Externa();
        //ex.new se volta ao conjunto de classes internas da classe externa
        Externa.Interna in=ex.new Interna();
        Externa.Interna in2=new Externa().new Interna();
   
        in.mostraNome();
    }
}

class Externa{
    private String nome="john suchimi de pandawan do DevDojo";
    private Interna interna=new Interna();
    //Classe Aninhada
    class Interna{
        public void mostraNome(){
            System.out.println(nome);
            System.out.println(this);//Referece a classe interna
            System.out.println(Externa.this);//Refere-se a classe mais externa
            System.out.println("-------------------");
        }
    }

        public Externa() {
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Interna getInterna() {
            return interna;
        }

        public void setInterna(Interna interna) {
            this.interna = interna;
        }
    
}