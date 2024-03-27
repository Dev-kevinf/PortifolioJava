package Portifilio;

import java.util.*;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("------------Conversor de Temperatura-----------");
		double converteFah;
		double converteKel;
		int escolha; 
		int temp = 0;
		do { 
			System.out.println("\n0 - Sair\n"
					+ "1 - Fahrenheit\n"
					+ "2 - Kelvin ");
			System.out.println("\nDigite qual temperatura deseja converter"
					+ " ou 0 para sair");

			escolha = teclado.nextInt();
			
		if ( escolha == 1) {
			System.out.println("Voce escolheu Fahrenheint: ");
			System.out.println("Agora digite a temperatura em celsius: ");
			temp = teclado.nextInt();
			converteFah = (temp * 9/5) + 32;
			System.out.printf("%dº Celsius é a igual a %.1f F" , temp , converteFah ,"\n");
		}else if(escolha == 2) {
			System.out.println("Voce escolheu Kelvin: ");
			System.out.println("Agora digite a temperatura em celsius: ");
			temp = teclado.nextInt();
			converteKel = temp + 273.15;
			System.out.printf("%dº Celsius é a igual a %.1f K" , temp , converteKel ,"\n");
			
		}
		else {
			System.out.println("Finalizando Programa....");
		}
			
		}while(escolha!= 0);
		
		teclado.close();
		
	}	



}

