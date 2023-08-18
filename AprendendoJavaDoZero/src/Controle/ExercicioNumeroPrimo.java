package Controle;

import java.util.Scanner;

public class ExercicioNumeroPrimo {
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = entrada.nextInt();

		for (int i = 2; i < n1; i++) {//começara do dois e irá até quando chegar no n1, e ira aumentando de 1 em 1
			if (n1 % i == 0) { //se n1 for divisivel por algun i que resulte em resto de 0 o contador será acrescentado
				contadorDeDivisores++;
			}
		}
	
		if (contadorDeDivisores == 0) {//se o contador for totalmente igual a 0 ele entrara aqui e fara os seguintes passos
			System.out.println(n1 + " é primo");
		}else {
			System.out.println(n1 + " não é primo");
		}
		
		
		entrada.close();
	}
}
