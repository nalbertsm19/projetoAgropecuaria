package models;

public abstract class Pessoa 
{ private String nome;
  private int dataNasc;
  private int cpf;
 
 
public String getNome() 
{
	return nome;
}
public void setNome(String nome) 
{
	this.nome = nome;
}
public int getDataNasc() 
{
	return dataNasc;
}
public void setDataNasc(int dataNasc) 
{
	this.dataNasc = dataNasc;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) 
{
	this.cpf = cpf;
}
 
 

}



