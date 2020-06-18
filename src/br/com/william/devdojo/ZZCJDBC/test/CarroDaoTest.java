/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZCJDBC.test;

import br.com.william.devdojo.ZZCJDBC.dao.CarroDaoImpl;
import br.com.william.devdojo.ZZCJDBC.dao.CompradorDao;
import br.com.william.devdojo.ZZCJDBC.model.Carro;
import br.com.william.devdojo.ZZCJDBC.model.Comprador;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CarroDaoTest {
    private static CarroDaoImpl dao=new CarroDaoImpl();
    private static Scanner sc=new Scanner(System.in);
    private static List<Carro> listaCarro;
    private static List<Comprador> listaComprador;
    public static void main(String[] args) {
        while(true){
            menu();
            System.out.println("Digite uma opção: ");
            int opcao=Integer.parseInt(sc.nextLine());
            if(opcao==1){
                try{
                    save();
                }catch(Exception ex){
                    System.err.println("houve um erro : "+ex);
                }
            }
            else if(opcao==2){
                update();
            }
            else if(opcao==3){
                update();
            }
            else if(opcao==4){
                getAllCarros();
            }
            else if(opcao==5){
                System.out.println("Digite algo:");
                getAllCarros(sc.nextLine());
            }
            else if(opcao==0){
                System.out.println("\nbye !!!");
                break;
            }
        }
    }
    private static void menu(){
        System.out.println("\tMenu do Carro:\n"
                    + "-------------------------\n"
                    + "1- Adicionar Carro\n"
                    + "2- Alterar Carro\n"
                    + "3- Excluir Carro\n"
                    + "4- Listar Carro\n"
                    + "5- Buscar por nome do comprador do Carro\n"
                    + "0- Sair\n\n");
    }
    private static void save(){
        
        System.out.println("Insira um novo carro: ");
        System.out.print("Digite um nome: ");
        String nome=sc.nextLine();
        System.out.print("Digite uma placa: ");
        String placa=sc.nextLine();
        
        getAllCompradores();
        
        System.out.print("\nDigite um código: ");
        int codigo=Integer.parseInt(sc.nextLine());
        Carro car=new Carro();
        car.setNome(nome);
        car.setPlaca(placa);
        car.setComprador(listaComprador.get(codigo));
        System.out.println(car);
        
        dao.save(car);
    }
    
    private static void update(){
        getAllCarros();
        
        System.out.println("Insira o código para alterar o carro: ");
        int codigo=0;
        
        codigo=Integer.parseInt(sc.nextLine());
        
        System.out.println("Carro selecionado: "+listaCarro.get(codigo));
        System.out.print("Digite um nome: ");
        String nome=sc.nextLine();
        System.out.print("Digite uma placa: ");
        String placa=sc.nextLine();
        
        getAllCompradores();
        
        System.out.print("\nDigite um código: ");
        int codigoC=Integer.parseInt(sc.nextLine());
        Carro car=new Carro();
        if(!nome.equals(""))
            car.setNome(nome);
        if(!placa.equals(""))
            car.setPlaca(placa);
        car.setComprador(listaComprador.get(codigoC));
        System.out.println(car);
        
        dao.update(car);
    }
    
    private static void remove(){
        Carro car=new Carro();
        car.setId(5);
        car.setNome("BMW");
        car.setPlaca("6666-666");
        car.setComprador(new Comprador(2, "", ""));
        
        dao.remove(11);
    }
    
    private static void getAllCompradores(){
        int cont=0;
        preencheListaCompradores();
        for(Comprador c:listaComprador){
            System.out.println("["+cont+"] "+c.getId()+" "+c.getNome()+" "+c.getCpf());
            cont++;
        }

    }
    private static void getAllCarros(){
        int cont=0;
        preencheListaCarros();
        for(Carro c:listaCarro){
            System.out.println("["+cont+"] "+c.getId()+" "+c.getNome()+" "+c.getPlaca()+" "+c.getComprador().getNome());
            cont++;
        }

    }
    private static void preencheListaCarros(){
        listaCarro=dao.getAll();
    }
    private static void getAllCarros(String str){
        int cont=0;
        preencheListaCarros(str);
        for(Carro c:listaCarro){
            System.out.println("["+cont+"] "+c.getId()+" "+c.getNome()+" "+c.getPlaca()+" "+c.getComprador().getNome());
            cont++;
        }

    }
    private static void preencheListaCarros(String str){
        listaCarro=dao.getAll(str);
    }
    private static void preencheListaCompradores(){
        listaComprador=new CompradorDao().getAll();
    }
    
}
