package Portifilio;
import java.util.*;

public class Calc4Op {
	public static void main(String[] args) {		
			
		float resultado;
		char op = 0;
		Scanner entrada = new Scanner(System.in);

		while(op != 's' && op != 'S') {
		System.out.println("------------------Calculando as 4 "
					+ "operações--------------------");
		System.out.println("Digite o primeiro numero ou S para sair:\n");
		float num1 = entrada.nextFloat();
		System.out.println("Digite a opeção desejada:\n1.(+) Para Soma \n"
			+ "2.(-) Para Subtração\n3.(/) "
			+ "Para Divisão\n4.(x) Para multiplicação)\n"+
			"5.(S) para sair");
		 op = entrada.next().charAt(0);
			if(op == 'S' || op == 's') {
				System.out.println("Finalizando calculadora....");
				System.out.println("\nMuito obrigado!!!!");
			 	break;}
			
			
		System.out.println("Digite o segundo numero:");
		float num2 = entrada.nextFloat();
			if(op == '+') {
			resultado = num1 + num2 ;
			System.out.printf("%.0f + %.0f = %.0f\n\n" , num1 , num2 , resultado );
			}else if(op == '-') {resultado = num1 - num2 ;
			System.out.printf("%.0f - %.0f = %.0f\n\n" , num1 , num2 , resultado );
			}else if(op == '/') {resultado = num1 /  num2 ;
			System.out.printf("%.0f / %.0f = %.0f\n\n" , num1 , num2 , resultado );
			}else if(op == 'X' || op == 'x') {resultado = num1 * num2 ;
			System.out.printf("%.0f * %.0f = %.0f\n\n" , num1 , num2 , resultado );
					
				}else {
					System.out.println("Formato Invalido!!");
				}
			
		}		
			entrada.close();
 							
	}
}


		
		






