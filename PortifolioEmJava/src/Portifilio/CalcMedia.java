package Portifilio;
import java.util.*;

public class CalcMedia {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int qntdNotas;
		
		System.out.println("-----------Calcula Media------------");
		System.out.println("\nDigite o seu nome: ");
		String nome = teclado.next();
		System.out.println("\nOla " + nome + ", Digite quantas notas você "
				+ "deseja calcular: ");
		qntdNotas = teclado.nextInt();
		
		double notas [] = new double [qntdNotas] ;
		
		for (int i = 0; i < notas.length; i++ ) {
			System.out.println("Digite a nota " + (i + 1)+ " - (0 - 10): ");
			notas [i]= teclado.nextDouble();
	}
		if(qntdNotas == 1 ) {
			System.out.printf("\nSuas nota foi " + Arrays.toString(notas));
		}else {
			System.out.println("\nSuas notas foram " + Arrays.toString(notas));
		}
		double totalNum = 0;
		for(double nota : notas) {
			totalNum += nota;
		}
		double media = totalNum / qntdNotas;
		System.out.println("E Sua media foi  " + media);
	
		teclado.close();
		
		

	}
		

		}


