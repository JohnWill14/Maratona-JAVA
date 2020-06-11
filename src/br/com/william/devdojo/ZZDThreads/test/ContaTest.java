/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.ZZDThreads.test;

import br.com.william.devdojo.ZZDThreads.classe.Conta;


/**
 *
 * @author John William Vicente <johnwill.v.2017@gmail.com>
 */
public class  ContaTest implements Runnable{
    private Conta conta =new Conta();
    private  void saque(int valor){
        synchronized(conta){
            if(conta.getSaldo()>=valor){
                System.out.println(Thread.currentThread().getName()+" esta indo sacar a conta.");
                conta.saque(valor);

                System.out.println(Thread.currentThread().getName()+" completou um saque saldo he de "+conta.getSaldo()+"\n");
            }else 
                throw new IllegalArgumentException(Thread.currentThread().getName()+" "+valor+ " he um valor muito grande seu saldo he de "+conta.getSaldo()   );
        }
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                saque(10);
            }catch(Exception ex){
                System.out.println("Ohh meu Deus. "+ex);
//                break;
            }
        }
    }
    public static void main(String[] args) {
        ContaTest conta=new ContaTest();
        Thread th=new Thread(conta, "john William");
        Thread th2=new Thread(conta, "beatriz");
        th.start();
        th2.start();
       
    }
}
