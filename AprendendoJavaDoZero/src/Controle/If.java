package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media <=10 && media >= 7.0) { // as chaves serve para definir um bloco, por isso sempre deve ser aberta e fechada quando temos um IF e ela serve para mostrar o bloco até onde ela vai
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		
		if (media < 7 && media >= 5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovadoAtingido = media < 5 && media >= 0;
		
		if (criterioReprovadoAtingido) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
