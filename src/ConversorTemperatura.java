import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		/*Escreva um programa que, com base em uma temperatura em graus celsius, 
		 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
		 * seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; 
		 * Ra = C * 1.8 + 32 + 459.67
		 */
		Scanner leitor = new Scanner(System.in);
		double temperatura;
		System.out.println("Digite a temperatura em Celsius(C)");
		temperatura = leitor.nextDouble();
		
		System.out.println("Temperatura em Fahrenheit(F) : " + (temperatura * 1.8 + 32) );
		System.out.println("Temperatura em Kelvin(K) : " + (temperatura + 273.15) );
		System.out.println("Temperatura em Réaumur(Re) : " + (temperatura * 0.8) );
		System.out.println("Temperatura em Rankine(Ra) : " + (temperatura * 1.8 + 32 + 459.67) );
		
		leitor.close();
	}

}
