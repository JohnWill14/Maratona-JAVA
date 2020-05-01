/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Wio.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class StreamsTest {
    //Stream fluxo de dados
    public static void main(String[] args) {
        gravarTunado();
        leitorTunado();
    }
    private static void gravar(){
        byte[] dados={
            65,66,67,68,69,70
        };
        try(FileOutputStream fos=new FileOutputStream("pasta/stream.txt");){
            for(byte dado:dados){
                fos.write(dado);
            }
            System.out.println("Dados gravados com sucesso");
            //fors.write(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private static void leitor(){
        
        try(FileInputStream fos=new FileInputStream("pasta/stream.txt");){
            int leitura;
            while((leitura=fos.read())!=-1){
                System.out.print((char)leitura);
            }
            System.out.println("\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private static void gravarTunado(){
        byte[] dados={
            65,66,67,68,69,70
        };
        try(BufferedOutputStream gravador=new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"),4098);){
            gravador.write(dados);
            gravador.flush();
            System.out.println("Dados gravados com sucesso");
            //fors.write(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     private static void leitorTunado(){
        
        try(FileInputStream fos=new FileInputStream("pasta/stream.txt");
                BufferedInputStream leitor=new BufferedInputStream(fos)){
            int leitura;
            while((leitura=leitor.read())!=-1){
                System.out.print((char)leitura);
            }
            System.out.println("\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
