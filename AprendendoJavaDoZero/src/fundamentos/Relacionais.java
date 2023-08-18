package fundamentos;

public class Relacionais {
	public static void main(String[] args) {
		double a = 3;
		double b = 3;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		double nota = 7;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("\nTem desconto? " + temDesconto);
		
	}
}
