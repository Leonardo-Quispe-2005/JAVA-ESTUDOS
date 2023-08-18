package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a); //implícita
		
		float b = (float)1.123456788888; //explicita (cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicita (cast) - conversão toda maluca, más colocando esse parenteses com byte ele entende que eu sei o que estou prestes a fazer
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f); //explicita (cast) - aqui houve claramente perca de dados
		
		
		
	}
}
