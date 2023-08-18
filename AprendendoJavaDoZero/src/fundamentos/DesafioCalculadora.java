package fundamentos;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		String Valor1 = JOptionPane.showInputDialog("Digite o valor 1").replace(",", ".");
		String Valor2 = JOptionPane.showInputDialog("Digite o valor 2").replace(",", ".");
		
		double N1 = Double.parseDouble(Valor1);
		double N2 = Double.parseDouble(Valor2);
		
		double Soma = N1 + N2;
		double Subtracao = N1 - N2;
		double Multiplicacao = N1 * N2;
		double Divisao = N1 / N2;
		double Resto = N1 % N2;
		
		
		System.out.println("Aqui está a soma dos dois números: " + Soma);
		System.out.println("Aqui está a subtração dos dois números: " + Subtracao);
		System.out.println("Aqui está a multiplicação dos dois números: " + Multiplicacao);
		System.out.println("Aqui está a divisão dos dois números: " + Divisao);
		System.out.println("Aqui está o Resto da divisão dos dois números: " + Resto);
		
		
//		Jeito do meu professor da Udemy
/*		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número:");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o número:");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação:");
		double op = entrada.nextDouble();
		
		//lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : 0;
		resultado = "*".equals(op) ? num1 * num2 : 0;
		resultado = "/".equals(op) ? num1 / num2 : 0;
		resultado = "%".equals(op) ? num1 % num2 : 0;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2,resultado);
		
		entrada.close();
*/
	}
}
