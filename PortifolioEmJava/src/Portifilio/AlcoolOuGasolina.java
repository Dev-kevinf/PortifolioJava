package Portifilio;
import java.util.*;

public class AlcoolOuGasolina {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("-----------Alcool ou Gasolina-----------\n");
		
		System.out.println("Qual seu nome:");
		String nome = teclado.next();
		System.out.println("\nOlá " + nome + ", esse programa é para mostra-lo se compensa "
				+ "abastecer com Alcool ou Gasolina " );
		
		System.out.println("\nDigite o valor do Alcool: ");
		float valorAlcool = teclado.nextFloat();
		System.out.printf("\n");
		
		System.out.println("Agora digite o valor da gasolina");
		float valorGasolina = teclado.nextFloat();
		System.out.printf("\n");
		
		float resultadoAbastece;
		resultadoAbastece = (valorAlcool / valorGasolina );
		float valorDiferença = valorGasolina - valorAlcool; 
		
		if (resultadoAbastece <= 0.7) {
			System.out.printf("A gasolina esta R$ %.2f mais caro." , valorDiferença );
			System.out.println("\nE nesse preço , abasteça seu veiculo com Alcool. ");
		
		}else if (resultadoAbastece > 0.7) {
			System.out.printf("A gasolina esta R$ %.2f mais caro." , valorDiferença );
			System.out.println("\nE nesse preço , abasteça seu veiculo com Gasolina.");
		}
		
		teclado.close();
		
	}
}
