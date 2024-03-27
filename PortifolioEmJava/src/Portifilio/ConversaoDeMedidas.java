package Portifilio;
import java.util.Scanner;

public class ConversaoDeMedidas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int continuar;
		
		do {  
			System.out.println("-----------------Conversor de metros para unidades"
					+ " de medida-----------------");
			
			System.out.println("\n1 - Quilometros\n"
					+ "2 - Centimetros\n"
					+ "3 - Milimetros\n"
					+ "4 - Milhas\n"
					+ "5 - Polegada\n"
					+ "0 - Sair\n"
					+ "\nInsira para qual medida deseja converter: (1,2,3,4,5 ou 0 para sair)\n");
			int medida = entrada.nextInt();
			
			if(medida == 0) {
			System.out.println("\nVocê escolheu sair , finalizando programa...");
			System.out.println("Muito obrigado por utilizar nosso programa!!");		
				break;
			}
			
			float quilometro, centimetro ,milimetro , milhas , polegadas;
			
			System.out.println("\nInsira um valor de medida:");
			float valorMedida = entrada.nextFloat();
			
			switch(medida) {
			case 1:
				quilometro = (valorMedida / 1000);
				System.out.printf("%.0f Metros é igual a %.0f"
					+ " Quilometros\n\n" , valorMedida , quilometro );			
					break;
			
			case 2:
				centimetro = (valorMedida  * 100);
				System.out.printf("%.0f Metros é igual a %.0f"
				+ " Centimetros\n\n" , valorMedida , centimetro );			
					break;
			
			case 3:
				milimetro = (valorMedida  * 1000);
				System.out.printf("%.0f Metros é igual a %.0f"
				+ " Milimetros\n\n" , valorMedida , milimetro );			
					break;		
				
			case 4:
				milhas = (valorMedida  / 1609);
				System.out.printf("%.2f Metros é igual a %.0f"
				+ " Milhas\n\n" , valorMedida , milhas );			
					break;
					
			case 5:
				polegadas = (valorMedida  * 39.37f);
				System.out.printf("%.2f Metros é igual a %.0f"
				+ " Polegadas\n\n" , valorMedida , polegadas );	
				break;
			
			default:
				System.out.println("Opção invalida!!");
				break;
			}
			
			System.out.println("Deseja continuar ? ( 0 - Não || 1 - Sim )");	
			continuar = entrada.nextInt();
			}while(continuar != 0);
	

	
			entrada.close();
		
	}
}
