/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZAserializacao.test;

import br.com.william.devdojo.ZAserializacao.classe.Aluno;
import br.com.william.devdojo.ZAserializacao.classe.Turma;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author usuario
 */
public class SerilizacaoTest {
    public static void main(String[] args) {
        Aluno aluno=new Aluno(1, "jon William", "123");
        aluno.setTurma(new Turma("12z09"));
        try {
            gravadorObjeto(aluno);
            aluno=(Aluno) leitorObjeto();
            System.out.println(aluno);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private static void gravadorObjeto(Aluno aluno) throws FileNotFoundException, IOException{
        FileOutputStream fos=new FileOutputStream("aluno.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(aluno);
        oos.close();
        fos.close();
    }
    
    private static Object leitorObjeto() throws FileNotFoundException, IOException{
        Object object=null;
        try {
            
            FileInputStream fis=new FileInputStream("aluno.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            object=ois.readObject();
            ois.close();
            fis.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerilizacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }
    
}
