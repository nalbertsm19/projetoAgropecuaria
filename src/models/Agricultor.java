package models;

public class Agricultor extends Pessoa
{private int codAgricultor;
 private String areaServico;
 
public Agricultor(int codAgricultor, String areaServico) 
{
     this.codAgricultor = codAgricultor;
     this.areaServico = areaServico;
 }
 
public int getCodAgricultor() 
{
	return codAgricultor;
}
public void setCodAgricultor(int codAgricultor)  {
	this.codAgricultor = codAgricultor;
}
public String getAreaServico() 
{
	return areaServico;
}
public void setAreaServico(String areaServico) 
{
	this.areaServico = areaServico;
}
 
 

}
