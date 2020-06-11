/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.test;

import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import br.com.william.devdojo.ZZCJDBC.dao.CompradorDao;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MenuComprador {
    
    private static  Scanner sc=new Scanner(System.in);
    private static CompradorDao dao=new CompradorDao();
    private static Comprador comp=new Comprador();
    private static List<Comprador> listaComprador;
    public static void main(String[] args) {
        
        new MenuComprador().Cardapio();
    }
    public void Cardapio(){
        
        int opcao = 0;
       
        while(true){
            menu();
            try{
                opcao=Integer.parseInt(sc.nextLine());
            }catch(java.lang.NumberFormatException ex){
                opcao=990;
            }
            if(opcao==1){
                salve();
            }else if(opcao==2){
                update();
            }else if(opcao==3){
                remove();
            }else if(opcao==4){
                getAll();
                System.out.println("\n");
            }
            else if(opcao==0){
                System.out.println("bye !!!");
                
                break;
            }
            else if(opcao==5){
                System.out.println("Digite um nome para busca-lo: ");
                String str=sc.nextLine();
                getByName(str);
                System.out.println("\n");
            }
            else{
                
                System.out.println("Opcao invalida tente novamente !");
            }
        }
    }
    private static void menu(){
         System.out.println("\tMenu do Comprador:\n"
                    + "-------------------------\n"
                    + "1- Adicionar Comprador\n"
                    + "2- Alterar Comprador\n"
                    + "3- Excluir Comprador\n"
                    + "4- Listar Comprador\n"
                    + "5- Buscar por nome do Comprador\n"
                    + "0- Sair\n\n");
    }
    private static void getUserConsole(Scanner sc,Comprador comp){
        System.out.print("Adicione um nome, aperte enter para pular: ");
        String nome=sc.nextLine();
        
        
        System.out.print("Adicione um cpf, aperte enter para pular: ");
        String cpf=sc.nextLine();
        if(!nome.equals(""))
          comp.setNome(nome);
        if(!cpf.equals(""))
          comp.setCpf(cpf);
    }
    private static void getAll(){
        int cont=0;
        preencheLista();
        for(Comprador c:listaComprador){
            System.out.println("["+cont+"] "+c.getId()+" "+c.getNome()+" "+c.getCpf());
            cont++;
        }

    }
    private static void getByName(String str){
        int cont=0;
        preencheLista(str);
        for(Comprador c:listaComprador){
            System.out.println("["+cont+"] "+c.getId()+" "+c.getNome()+" "+c.getCpf());
            cont++;
        }

    }
    private static void salve(){
        getUserConsole(sc, comp);            
        dao.save(comp);
        System.out.println("salvo\n\n");
    }
    private static void update(){
        getAll();
        System.out.println("Digite o código: ");
        try{
         comp=listaComprador.get(Integer.parseInt(sc.nextLine()));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Comprador "+comp.getNome()+" selecionado para ser alterado !!");
        getUserConsole(sc, comp);
        dao.update(comp);

        System.out.println("atualizado\n\n");
    }
    private static List<Comprador> preencheLista(){
        listaComprador=dao.getAll();
        return listaComprador;
    }
    private static List<Comprador> preencheLista(String str){
        listaComprador=dao.getAll(str);
        return listaComprador;
    }
    
    private static void remove(){
        getAll();
        System.out.println("Digite o código: ");
        int codigo=Integer.parseInt(sc.nextLine());
        comp=listaComprador.get(codigo);
        System.out.println("Comprador "+comp.getNome()+" selecionado para ser removido !!");
        System.out.println("\nTem certeza que deve remove-lo ? [S/N]");
        char resp=sc.nextLine().charAt(0);
        if(resp=='S'){
            dao.remove(comp);
            System.out.println("Removido com sucesso");
        }
    }
}
