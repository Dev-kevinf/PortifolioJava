package Portifilio;
import java.util.*;

public class AnoBissexto {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int continuar = 1;
	System.out.println("--------------Calcula Ano Bissexto---------------\n");
	
	while(continuar != 0) {
		
	System.out.println("Digite um ano para saber se ele é bissexto:");
	int ano = teclado.nextInt();
	
	if (ano % 4 == 0) {
		System.out.printf("\nAno: %d é bissexto" , ano);
	}else {
		System.out.printf("\nAno: %d não é bissexto" , ano);
	}
	
	System.out.println("\nDeseja continuar? (0 - Não || 1 - Sim)");
	continuar = teclado.nextInt();
	if (continuar == 0) {
		System.out.println("\nFinalizando programa!!!");
		System.out.println("Ate a proxima...");
	}
	}
	
	teclado.close();
	}

}
