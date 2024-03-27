package Portifilio;

import java.util.*;

public class Tabuada {
	public static void main(String[] args) {
		
		int num  , resultado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a tabuada que deseja : (1 - 10)");
		num = teclado.nextInt();
        System.out.println("Tabuada do " + num + ":\n");

		for (int i = 1 ; i<=20; i++) {
			resultado = num * i;
			System.out.printf("%d X %d = %d\n" ,  i, num , resultado);
		}
		teclado.close();
} 

}