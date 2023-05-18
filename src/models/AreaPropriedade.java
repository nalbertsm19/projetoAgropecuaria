package models;
import models.Agricultor;

public class AreaPropriedade 
{private int codSolo;
 private String tipoSolo;
 private double areaTotalSolo;
 private AreaPropriedade area;
 
public AreaPropriedade(int codSolo, String tipoSolo, double areaTotalSolo) 
{
     this.codSolo = codSolo;
     this.tipoSolo = tipoSolo;
     this.areaTotalSolo = areaTotalSolo;
 }
public int getCodSolo() 
{
	return codSolo;
}
public void setCodSolo(int codSolo) 
{
	this.codSolo = codSolo;
}
public String getTipoSolo() 
{
	return tipoSolo;
}
public void setTipoSolo(String tipoSolo) 
{
	this.tipoSolo = tipoSolo;
}
public double getAreaTotalSolo() 
{
	return areaTotalSolo;
}
public void setAreaTotalSolo(double areaTotalSolo) 
{
	this.areaTotalSolo = areaTotalSolo;
}
public void setAreaPropriedade(AreaPropriedade areaPropriedade) {
    this.area = areaPropriedade;
}
 

}

