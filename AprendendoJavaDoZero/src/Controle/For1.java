package Controle;

public class For1 {
	public static void main(String[] args) {
// No for eu tenho uma quantidade de repetições já estabelecidas e no while é uma quantidade de repetiçoes indeterminada
// Temos 3 partes na estruta do for -- Declaração da variável; Expressão (Verdadeiro ou Falso)(é o que determina se ele vai continuar repetindo ou não);Manipulação da variável de controle para que em um determinado momento o laço pare de executar
		
		
		
		//estrutura focada para uma certa quantidade de repetições
		for (int contador = 0; contador <= 10; contador++) { // for(variável; expressão; encremento) ----- é assim a sequência do for(;;;)
			System.out.printf("i = %d\n", contador);
		}
		
		
		//Estrutura de repetição infinita -- laço infinito
//		for(;;) {
//			System.out.println("Infinito");
//		}
		
	}
}
