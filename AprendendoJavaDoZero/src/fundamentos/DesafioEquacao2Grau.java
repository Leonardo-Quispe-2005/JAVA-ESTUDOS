package fundamentos;

public class DesafioEquacao2Grau {
	public static void main(String[] args) {
		double a = 1;
		double b = 12;
		double c = -13;
		double delta = ((double)Math.pow(b, 2)) - 4 * a * c ; // O Math.pow serve como exponenciação, 
		
		System.out.println("O delta é: " + delta);
		System.out.println("///////////////////");
		
		double bhaskara1 = (-b + (Double)Math.sqrt(delta)) / 2; // O Math.sqrt serve para eu descobrir a raiz quadrada
		System.out.println("O X1 de Bhaskara é: " + bhaskara1);
		
		double bhaskara2 = (-b - (Double)Math.sqrt(delta)) / 2 ;
		System.out.println("O X2 de Bhaskara é: " + bhaskara2);
	}
}
