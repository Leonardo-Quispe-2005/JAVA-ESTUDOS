package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		} else if (nota >= 9) {
			System.out.println("Aprovado1");
		} else if (nota >= 7) {
			System.out.println("Aprovado2");
		} else if (nota >= 5) {
			System.out.println("Aprovado3");
		} else if (nota >= 3) {
			System.out.println("Reprovado1");
		} else if (nota >= 0) {
			System.out.println("Reprovado2");
		}
		
		
		entrada.close();
	}
}
