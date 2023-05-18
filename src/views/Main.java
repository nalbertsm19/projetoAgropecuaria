package views;
import java.util.Calendar;
import java.sql.Date;
import models.Agricultor;
import models.AreaPlantada;
import models.AreaPropriedade;
import models.Cliente;
import models.TratamentoSolo;

public class Main {

	public static void main(String[] args) 
	{
	
		   Agricultor agricultor = new Agricultor(1, "�rea A");
	        Cliente cliente = new Cliente(1, Calendar.getInstance().getTime());
	        AreaPropriedade areaPropriedade = new AreaPropriedade(1, "Argiloso", 1000);
	        AreaPlantada areaPlantada = new AreaPlantada(1, 500, "Horta", "Boa qualidade", "Tomate", 1);
	        TratamentoSolo tratamentoSolo = new TratamentoSolo(1, "Adubo Org�nico", "6.5");

	    

	        System.out.println("Agricultor:");
	        System.out.println("C�digo: " + agricultor.getCodAgricultor());
	        System.out.println("�rea de Servi�o: " + agricultor.getAreaServico());

	        System.out.println("\nCliente:");
	        System.out.println("C�digo: " + cliente.getCodCliente());
	        System.out.println("Cliente Desde: " + cliente.getClienteDesde());

	        System.out.println("\n�rea Plantada:");
	        System.out.println("C�digo: " + areaPlantada.getCodArea());
	        System.out.println("Tamanho da �rea: " + areaPlantada.getTamArea() + " metros quadrados");
	        System.out.println("Tipo da �rea: " + areaPlantada.getTipoArea());
	        System.out.println("Descri��o da Qualidade: " + areaPlantada.getDescricaoQualidade());
	        System.out.println("Esp�cie de Semente: " + areaPlantada.getEspSemente());
	        System.out.println("C�digo do Agricultor: " + areaPlantada.getCodAgricultor());

	        System.out.println("\n�rea Propriedade:");
	        System.out.println("C�digo do Solo: " + areaPropriedade.getCodSolo());
	        System.out.println("Tipo do Solo: " + areaPropriedade.getTipoSolo());
	        System.out.println("�rea Total do Solo: " + areaPropriedade.getAreaTotalSolo() + " metros quadrados");

	        System.out.println("\nTratamento do Solo:");
	        System.out.println("C�digo do Tratamento: " + tratamentoSolo.getCodTratamento());
	        System.out.println("Adubo Usado: " + tratamentoSolo.getAduboUsado());
	        System.out.println("pH do Adubo: " + tratamentoSolo.getPhAdubo());
		
	}

}
