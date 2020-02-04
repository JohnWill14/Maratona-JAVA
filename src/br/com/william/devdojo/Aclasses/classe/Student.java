package br.com.william.devdojo.Aclasses.classe;

public class Student{
	private String nome;
	private int id;
	private String matricula;

	public void setNome(String a){
		this.nome=a;
	}
	public String getNome (){
		return nome;
	}
	public void setId (int id){
		this.id=id;
	}
	public int getId (){
		return this.id;
	}
	public void setMatricula( String m){
		this.matricula=m;
	}
	public String getMatricula(){
		return matricula;
	}
}