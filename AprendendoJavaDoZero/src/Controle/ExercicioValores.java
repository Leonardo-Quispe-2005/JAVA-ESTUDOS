package Controle;

import java.util.Scanner;

public class ExercicioValores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			
			System.out.println("Digite um número");
			int valor = entrada.nextInt();
			
			if (valor > maiorValor) {//entrara nesta situação se valor for maior do que maiorValor
				maiorValor = valor; // esse valor se tornará o novo maiorValor
			}
			
			contador++; //contando quantas vezes o programa está sendo executado
			
		} while (contador != 10); // se o contador passar de 10 execuções o programa será encerrado
		
		System.out.printf("O maior valor foi: " + maiorValor);
		
		entrada.close();
	}
}
