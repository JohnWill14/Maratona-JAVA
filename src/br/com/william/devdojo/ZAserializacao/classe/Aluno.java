/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZAserializacao.classe;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Aluno implements Serializable{
    private int id;
    private String nome;
    private transient String password;//não serializado
    private static String escola="DEVDOJO";
    private transient Turma turma;

    public Aluno(int id, String nome, String password, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.turma = turma;
    }

    public Aluno(int id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getEscola() {
        return escola;
    }

    public static void setEscola(String escola) {
        Aluno.escola = escola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", password=" + password +
                ", escola="+Aluno.escola
                +", Turma="+turma+'}';
    }
    
    private void writeObject(ObjectOutputStream obj){
        try{
            obj.defaultWriteObject();
            obj.writeUTF(turma.getNome());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void readObject(ObjectInputStream is){
        try{
            is.defaultReadObject();
            turma=new Turma();
            turma.setNome(is.readUTF());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
