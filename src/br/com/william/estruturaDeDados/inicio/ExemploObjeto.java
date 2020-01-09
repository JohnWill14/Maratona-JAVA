package br.com.william.estruturaDeDados.inicio;

public class ExemploObjeto{
	public static void main(String args[]){
		Contador c=new Contador();// O new instanceia a classe e devolve uma referencia do obejeto da memoria para a variavel
		c.incrementa();
		Contador d=new Contador();
		d.incrementa();
		d.incrementa();
		d=c;
		System.out.println("c : "+c.getCont());//toString converte valores para String
		System.out.println("d : "+d.getCont());//d tem a mesma referencia que c
		System.out.println("c==d -> "+(c==d));// o == compara as referencias entre as variveis
	}

}

class Contador{
	protected int cont;
	public Contador(){cont=0;}
	public void incrementa(){
		cont+=1;
	}
	public void incrementa(int x){
		cont+=x;
	}
	public int getCont(){
		return cont;
	}

}
