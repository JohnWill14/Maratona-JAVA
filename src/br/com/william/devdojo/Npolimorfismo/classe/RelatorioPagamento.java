/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Npolimorfismo.classe;

/**
 *
 * @author usuario
 */
public class RelatorioPagamento {
    public void relatorioPagamentoGerente(Gerente g){
        System.out.println("Gerando relatorio de pagamento para gerencia");
        g.calcularPagamento();
        imprimi(g);
    }
    public void relatorioPagamentoVendedor(Vendedor v){
        System.out.println("Gerando relatorio de pagamento para vendedores");
        v.calcularPagamento();
        imprimi(v);
    }
    public void relatorioPagamento(Funcionario f){
        System.out.println("Gerando relatorio de pagamento para "+f.getClass().getSimpleName());
        f.calcularPagamento();
        imprimi(f);
    }
    private void imprimi(Funcionario f){
        System.out.println("Nome: "+f.getNome());
        System.out.println("Salario: R$ "+String.format("%.2f",f.getSalario()));
        if(f instanceof Gerente){// object instanceof Object => true
            System.out.println("PNL: "+((Gerente)f).getParticipacaoNoLucro());
        }else if(f instanceof Vendedor){
            System.out.println("Total de vendas: "+((Vendedor)f).getTotalDeVendas());
        }
    }
}
