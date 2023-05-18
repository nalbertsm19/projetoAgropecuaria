package models;

import java.util.Date;

public class Cliente extends Pessoa
{private int codCliente;
 private Date clienteDesde;
 
public Cliente(int codCliente, Date clienteDesde) 
{
     this.codCliente = codCliente;
     this.clienteDesde = clienteDesde;
 }
public int getCodCliente() 
{
	return codCliente;
}
public void setCodCliente(int codCliente) 
{
	this.codCliente = codCliente;
}
public Date getClienteDesde() 
{
	return clienteDesde;
}
public void setClienteDesde(Date clienteDesde) 
{
	this.clienteDesde = clienteDesde;
}
 
 

}
