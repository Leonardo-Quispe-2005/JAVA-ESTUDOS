package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int domingo = 1;
		int segunda = 2;
		int terca = 3;
		int quarta = 4;
		int quinta = 5;
		int sexta = 6;
		int sabado = 7;
		
		System.out.print("Digite o dia da semana ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("Você digitou domingo que é o " + domingo + " dia da semana");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Você digitou segunda que é o " + segunda + " dia da semana");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("Você digitou terça que é o " + terca + " dia da semana");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Você digitou quarta que é o " + quarta + " dia da semana");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Você digitou quinta que é o " + quinta + " dia da semana");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Você digitou sexta que é o " + sexta + " dia da semana");
		} else if(dia.equalsIgnoreCase("sabado")){
			System.out.println("Você digitou sabado que é o " + sabado + " dia da semana");
		} else {
			System.out.println("Você digitou um dia da semana inválida");
		}
		
		entrada.close();
	}
}
