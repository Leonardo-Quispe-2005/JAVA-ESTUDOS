package fundamentos;

import javax.swing.JOptionPane;

public class DesafioPesoAltura {
	
	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Digite seu peso");
		String altura = JOptionPane.showInputDialog("Digite a sua altura");
		
		double peso1 = Double.parseDouble(peso);
		double altura1 = Double.parseDouble(altura);
		double imc = peso1 / (altura1 * altura1);
		
		
		System.out.println("Seu peso é: " + peso + " Kg");
		System.out.println("Sua altura é: " + altura);
		System.out.println("Seu imc é: " + imc);
	}
	
}
