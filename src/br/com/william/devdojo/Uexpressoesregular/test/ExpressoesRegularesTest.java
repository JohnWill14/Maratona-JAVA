/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Uexpressoesregular.test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author usuario
 */
public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d carrega todos os digitos
        // \D tudo que não for digito
        // \s carrega espaços em branco \t \n \r \f
        // \S carrega  oq não é espaço em branco
        // \w carrega caracteres de palavras a-z e A-Z, 0-9 e _
        // \W carrega tudo que o '\w' não carrega
        // [] 
        // ? 0 ou 1 ocorrencia
        // * 0 ou mais ocorrencia
        // + 1 ou main ocorrencia
        // {n,m} n até m ocorrencias
        // () agrupar expressao
        // | colocar "OR"
        // $ fim de linha
        // o(v|c)o comece com o procure v ou c e que termine com o
        // . coringa 1.4 =1244 144 1A4 pode ser substituido por qualquer coisajava
        // ^ exclui algo que vc não quer
        
        
//        String regex="[a-cA-Z8-9]";
//        String regex="0[xX]([0-9a-fA-F]){1,3}(\\s|$)";
//        String texto="12 0x2 0X 0xfff0x1G 0x1";
//        String regex="([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+){1,2}(\\s|,|$)";//|([0-9]){1,2}/([0-9]){1,2}/([0-9]){2,4}";
//        String texto="johnwill.2017@gmail.com.br %44johnwill.@gmailcom ororor@ccc.com.br.br 16/03/2020";
        String regex="\\d{1,2}/(\\d{1,2}|([a-zA-Z]){3})/(\\d{2}|\\d{4})(\\s|,|$)";//"([0-9]){1,2}/([0-9]){1,2}/([0-9]){2,4}";
        String texto="16/03/2020 1/02/111 01/03/20 yy/54/5554 1/3/20 01/mar/2020";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: "+matcher.pattern());
        System.out.println("Posições encontradas:");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        System.out.println();
        System.out.println("Email valido: "+"!#102Abc@gmail.com".matches(regex));

    }
    
}
