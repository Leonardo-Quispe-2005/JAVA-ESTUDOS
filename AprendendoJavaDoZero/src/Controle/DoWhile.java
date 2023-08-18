package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {// no do while o programa será executado pelo menos 1 vez sempre
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();//pegando o texto da proxima linha
		} while (!texto.equalsIgnoreCase("por favor"));//se o texto for igual a por favor ele  encerrara o programa
		
		System.out.println("Obrigado");
		entrada.close();
	}
}
