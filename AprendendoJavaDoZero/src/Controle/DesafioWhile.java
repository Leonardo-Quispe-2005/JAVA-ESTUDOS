package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0; //começamos com 0 pois anda não temos nenhum registro
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota ou -1 para sair");
			nota = entrada.nextDouble(); //pega a nota da proxima linha
			
			if (nota < 10 && nota > 0) {//só entrarei nesse bloco quando a nota for menor que 10 e maior que 0
				total += nota; //o total será total + nota = x - esse x virá o novo total e na proxima sera total = x + y
				quantidadeNotas++; //irá acrescentar mais 1 a cada nota colocada
			}else if (nota != -1) { //quando a nota for diferente que -1 e maior que 0 e menor que 10, será uma nota inválida
				System.out.println("Nota inválida");
			}
			
		}
		
		//calcular a média
		double media = total / quantidadeNotas;
		System.out.println("Media: " + media);
		
		entrada.close();

	}
}
