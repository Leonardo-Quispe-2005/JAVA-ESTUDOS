package Controle;

import java.util.Scanner;

public class ExercicioLetraPorLetra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = entrada.nextLine();//escrevendo uma palavra		
		
		char letras[] = palavra.toCharArray();//transformando a palavra para array []
		System.out.println("a palavra possui " + letras.length + " caracteres\n");//o .length mostra quantos caracteres a palavra possui
		for (int i = 0; i < letras.length; i++) {//o .length mostra quantos caracteres a palavra possui
			
			System.out.println(letras[i]);// aqui estou mandando o java imprimir a array[i] letra por letra
		}
		
		
		entrada.close();

	}
}
