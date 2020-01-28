package br.com.william.desbravandojava.orientacaoobjetos.classe;

public class Metodos{
	/*
		Metodos são como funcoes e procedimentos
		mais são utilizados por objetos ou por classes, formato static.

		modificador tipo interface(param){
			body
			return tipo;
		} 

		public abstract int soma(int a,int b); uso em classes abstrtas
	*/
	public String nome;
	
	public Metodos(){
		//nao he permitido retorno
	}
	public Metodos(String nome){
		this();
		this.nome=nome;

	}
	public int soma(int a,int b){
		return a+b;
	}
	public static void altera(Metodos met,String nome){
		met.nome=nome;//met recebe a referencia do objeto
	}
	public static void main(String[] args) {
		Metodos metodos=new Metodos();//como nao são static deve se instanciar o objeto
		int soma=metodos.soma(1,2);
		System.out.println(soma+"\n");

		Metodos nome=new Metodos("john");
		altera(nome,"joao");
		System.out.println(nome.nome);
	}
}