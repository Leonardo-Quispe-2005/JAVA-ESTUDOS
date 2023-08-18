package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean t1 = false;
		boolean t2 = false;
		boolean tv50 = t1 && t2;
		boolean tv32 = t1 ^ t2;
		boolean sorvete = t1 || t2;
		boolean nada = !t1 && !t2;
		
		System.out.println("Comprou Tv de 50 - " + tv50);
		
		System.out.println("Comprou TV 32 - " + tv32);
		
		System.out.println("Comprou sorvete - " + sorvete);
		
		System.out.println("Nao comprou nada - " + nada);
		
		
		
		
	}
}
