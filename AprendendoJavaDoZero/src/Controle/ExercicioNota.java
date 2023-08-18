package Controle;

import java.util.Scanner;

public class ExercicioNota {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite 1 nota: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite 2 nota: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
				if (media >= 7) {
					System.out.println("Parabéns você foi aprovado pois tirou na média: " + media);
				} else if (media < 7 && media > 4){
					System.out.println("Que pena você ficou de recuperação pois tirou na média: " + media);
				}else {
					System.out.println("Infelizmente você foi reprovado pois tirou na média: " + media);
				}
			
		}else {
			System.out.println("Coloque novamente suas notas");
		}

		entrada.close();
	}
}
