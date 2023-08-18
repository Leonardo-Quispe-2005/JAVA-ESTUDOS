package fundamentos;

import javax.swing.JOptionPane;

public class DesafioArea {
	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Digite a base do triângulo: ");
		String altura = JOptionPane.showInputDialog("Digite a altura do triângulo: ");
		
		double base1 = Double.parseDouble(base);
		double altura1 = Double.parseDouble(altura);
		double area = (base1 * altura1) / 2;
		
		System.out.println("A área do triângulo é de: " + area);
		
	}
}
