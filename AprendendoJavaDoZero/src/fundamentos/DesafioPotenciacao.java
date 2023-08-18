package fundamentos;

import javax.swing.JOptionPane;

public class DesafioPotenciacao {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite o número");
		
		double n2 = Double.parseDouble(n1);
		double cubo = (double)Math.pow(n2, 2);
		double quadrado = (double)Math.pow(n2, 3);
		
		System.out.println("Aqui está o valor ao cubo: " + cubo);
		System.out.println("Aqui está o valor ao quadrado: " + quadrado);
	
	}
}
