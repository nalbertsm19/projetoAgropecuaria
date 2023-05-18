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
	
		   Agricultor agricultor = new Agricultor(1, "Área A");
	        Cliente cliente = new Cliente(1, Calendar.getInstance().getTime());
	        AreaPropriedade areaPropriedade = new AreaPropriedade(1, "Argiloso", 1000);
	        AreaPlantada areaPlantada = new AreaPlantada(1, 500, "Horta", "Boa qualidade", "Tomate", 1);
	        TratamentoSolo tratamentoSolo = new TratamentoSolo(1, "Adubo Orgânico", "6.5");

	    

	        System.out.println("Agricultor:");
	        System.out.println("Código: " + agricultor.getCodAgricultor());
	        System.out.println("Área de Serviço: " + agricultor.getAreaServico());

	        System.out.println("\nCliente:");
	        System.out.println("Código: " + cliente.getCodCliente());
	        System.out.println("Cliente Desde: " + cliente.getClienteDesde());

	        System.out.println("\nÁrea Plantada:");
	        System.out.println("Código: " + areaPlantada.getCodArea());
	        System.out.println("Tamanho da Área: " + areaPlantada.getTamArea() + " metros quadrados");
	        System.out.println("Tipo da Área: " + areaPlantada.getTipoArea());
	        System.out.println("Descrição da Qualidade: " + areaPlantada.getDescricaoQualidade());
	        System.out.println("Espécie de Semente: " + areaPlantada.getEspSemente());
	        System.out.println("Código do Agricultor: " + areaPlantada.getCodAgricultor());

	        System.out.println("\nÁrea Propriedade:");
	        System.out.println("Código do Solo: " + areaPropriedade.getCodSolo());
	        System.out.println("Tipo do Solo: " + areaPropriedade.getTipoSolo());
	        System.out.println("Área Total do Solo: " + areaPropriedade.getAreaTotalSolo() + " metros quadrados");

	        System.out.println("\nTratamento do Solo:");
	        System.out.println("Código do Tratamento: " + tratamentoSolo.getCodTratamento());
	        System.out.println("Adubo Usado: " + tratamentoSolo.getAduboUsado());
	        System.out.println("pH do Adubo: " + tratamentoSolo.getPhAdubo());
		
	}

}
