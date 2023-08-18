package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double F = 32;
//		Aqui eu mudo a temperatura que eu quero saber - sempre o primeiro valor
		double Ajuste = 76 - F;
		double C = Ajuste * 5/9;
		System.out.println("O resultado é: " + C);
		
		System.out.println("///////////////////////");
		
		
		double Ce = 32;
//		Aqui eu mudo a temperatura que eu quero saber - sempre o primeiro valor
		double AjusteC = (52 * 1.8) + Ce;
		double Fa = AjusteC;
		System.out.println("O resultado é: " + Fa);
		
	}
}
