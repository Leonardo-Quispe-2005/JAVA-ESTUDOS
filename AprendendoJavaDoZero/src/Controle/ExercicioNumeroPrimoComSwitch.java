package Controle;

import java.util.Scanner;

public class ExercicioNumeroPrimoComSwitch {
	public static void main(String[] args) {
		
		int contadoresDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");//mandando digitar um numero
		int n1 = entrada.nextInt();//será onde coloco o numero
		
		for (int i = 2; i < n1; i++) {//começara do dois e irá até quando chegar no n1, e ira aumentando de 1 em 1
			if (n1 % i == 0) {//se n1 for divisivel por algun i que resulte em resto de 0 o contador será acrescentado
				contadoresDeDivisores++;
			}
		}
		
		switch (contadoresDeDivisores) { 
		
		case 0: { //caso o contadoresDeDivisores for igual a 0 emprimira isto
			System.out.println(n1 + " é primo");
			break;
		}
		
		default:{ //caso o contadoresDeDivisores for diferente de 0 emprimira isto
			System.out.println(n1 + " não é primo");
			break;
		}
		
		}
		
		
		
		
		
		entrada.close();
	}
}
