/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Wio.test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.DataFormat;

/**
 *
 * @author usuario
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        try {
            File file=new File("Arquivo.txt");
            
            Boolean bool=file.createNewFile();//Cria um arquivo
            System.out.println(bool?"Foi criado com sucesso":"nao foi criado, talvez já exista");
            System.out.println(file.exists());//True se existe e false adivinha....
//            System.out.println(file.delete());//Bem sujestivo deleta o bichimmm....
            
            System.out.println("PATH: "+file.getPath());
            System.out.println("PATH Absolute: "+file.getAbsolutePath());
            
            DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL, new Locale("pt","BR"));
            System.out.println("Ultima alteração: "+df.format(new Date(file.lastModified())));
            System.out.println("Diretorio ?"+file.isDirectory());
            System.out.println("Hidden: "+file.isHidden());
            if(file.exists()){
                System.out.println("Deletado? "+file.delete());
            }
//            System.out.println(new File("testeDiretorio").delete());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
