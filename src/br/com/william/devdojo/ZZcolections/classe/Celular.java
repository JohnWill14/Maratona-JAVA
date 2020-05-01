/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZcolections.classe;

/**
 *
 * @author usuario
 */
public class Celular {
    private String nome;
    private String IME;

    public Celular() {
    }

    public Celular(String nome, String IME) {
        this.nome = nome;
        this.IME = IME;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIME() {
        return IME;
    }

    public void setIME(String IME) {
        this.IME = IME;
    }
    
    //Reflexivo- x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico para x e y diferente de null, x.equals(y)==true logo y.equals(x)==y
    //Transitividade para x y z  diferente de null, se x.equals(y)==true, logo y.equals(x)==true e x.equals(z)==true logo y.equals(z) == true
    //Conscistente x.equals(y) deve retornar o mesmo valor
    //x diferente de null x.equals(null) retorne false
    @Override
    public boolean equals(Object o) {
       if(o==null)return false;
       if(this==o)return true;
       if(this.getClass()!=o.getClass())return false;
       Celular cel=(Celular)o;
       if(this.nome.equals(cel.getNome())){
           if(this.IME.equals(cel.getIME()))return true;
           else return false;
       }else return false;
    }

    //Se x.equals(y)==true logo x.hashCode()==y.hashCode()
    //y.hashCode()==x.hashCode() não necessariamente  deverá retornar true Alex-42 e bob-42
    //y.equals(x)==false logo x.hashCode()!=y.hashCode() reciproca é verdadeira
    @Override
    public int hashCode() {
        
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
