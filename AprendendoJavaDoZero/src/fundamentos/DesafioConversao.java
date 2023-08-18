package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite antepenultimo salário: ");
		String valor2 = JOptionPane.showInputDialog("Digite penultimo salário: ");
		String valor3 = JOptionPane.showInputDialog("Digite último salário: ");
		
		double numero1 = Double.parseDouble(valor1.replace(",", "."));
		double numero2 = Double.parseDouble(valor2.replace(",", "."));
		double numero3 = Double.parseDouble(valor3.replace(",", "."));
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos últimos 3 salários é de: " + soma);
		
		double media = soma / 3;
		System.out.println("A média dos últimos 3 salários é de: " + media);
				
		
/*	    
  		Método do PROFESSOR DA UDEMY
  
  		Scanner entrada = new Scanner(System.in);// devo sempre lembrar de abrir e fechar o scanner, para poupar memória
		
		System.out.print("Informe o primeiro salário: ");
		String valor1 = entrada.next().replace(",","."); 
		
		System.out.print("Informe o primeiro salário: ");
		String valor2 = entrada.next().replace(",","."); 
		
		System.out.print("Informe o primeiro salário: ");
		String valor3 = entrada.next().replace(",","."); 
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos últimos 3 salários é de: " + soma);
		
		double media = soma / 3;
		System.out.println("A média dos últimos 3 salários é de: " + media);
		
		entrada.close(); // devo sempre lembrar de abrir e fechar o scanner, para poupar memória	

*/
		
		
		
		
		
		
	}
}
