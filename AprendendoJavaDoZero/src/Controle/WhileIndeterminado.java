package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = ""; // valor não está recebendo nada por enquanto
		
		while (!valor.equalsIgnoreCase("sair")) { // aqui ele fechara o programa quando o valor digitado for igual a "sair"
			System.out.print("O que está pensando: "); // aqui é só uma frase antes do que vai ser escrito
			valor = entrada.nextLine(); // aqui a variavel valor recebe um novo valor quando for para a próxima linha, se esse novo valor for sair ele fechara o programa
		}
		
		entrada.close();
		
	}
}
