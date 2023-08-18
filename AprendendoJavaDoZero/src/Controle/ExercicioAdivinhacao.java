package Controle;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAdivinhacao {
		  /**
		  * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
		  * um número aleatório em uma variável. O Jogador tem 10 tentativas para
		  * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
		  * de tentativas restantes, e imprima se o número inserido é maior ou menor do
		  * que o número armazenado.
		  */
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int continuar, numeroSorteado, tentativas, numero;
		
		do {
			System.out.println("Sorteando um número aleatório entre 0 e 100\n");
			Random numeroAleatorio = new Random(); //Random faz gerar um número aleatório - mais sobre Ramdom - https://blog.betrybe.com/java/java-random/
			numeroSorteado = numeroAleatorio.nextInt(101); // Aprender sobre Scanner - https://www.mestresdaweb.com.br/tecnologias/como-funciona-a-classe-scanner-do-java
			
			System.out.println("O jogo começou, quero ver você me derrotar");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativas %d: ", tentativas);
				numero = entrada.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.printf("\nO numero sorteado é menor que %d \n\n",numero);
				}else if (numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado é maior que %d \n\n",numero);
				}else {
					System.out.printf("\\nParabens! Voce acertou o numero em %d tentativas! \n\n", tentativas);
					break;
				}
				
				
			} while (tentativas !=10);
				
				System.out.println("Digite 0 para sair ou qualquer outro numero para continuar: ");
				continuar = entrada.nextInt();
			
		} while (continuar != 0);
		
		entrada.close();
	}
}
