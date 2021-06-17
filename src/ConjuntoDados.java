import java.util.Scanner;

public class ConjuntoDados {

	public static void main(String[] args) {
		/*Tem-se um conjunto de dados contendo a altura e o sexo 
		 * (masculino, feminino) de 10 pessoas. Fazer um algoritmo que 
		 * calcule e escreva:
		a. a maior e a menor altura do grupo;
		b. média de altura dos homens;
		c. o número de mulheres.*/
		Scanner leitor = new Scanner(System.in);
		double[] altura = new double[10];
		String[] sexo = new String[10];
		double mediaAltura=0,maiorAltura=0,menorAltura=10;
		int mulheres=0,homens=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite masculino ou feminino");
			sexo[i] = leitor.next();
			System.out.println("Digite a altura da pessoa");
			altura[i] = leitor.nextDouble();
			if(sexo[i].equals("masculino")) {
				mediaAltura = mediaAltura + altura[i];
				homens +=1;
			}
			if(sexo[i].equals("feminino")) {
				mulheres += 1;
				}
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
			System.out.println("Maior Altura do grupo : " + maiorAltura);
			System.out.println("Maior Altura do grupo : " + menorAltura);
			System.out.println("Media altura dos homens : " + mediaAltura/homens);
			System.out.println("Numero de mulheres : " + mulheres);
			leitor.close();
	}
}						

