package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
/*		
		int a = 3 * 4 - 10;
		int b = (int)Math.pow(a, 3); // O Math.pow é a potencia da matemática
		double c = Math.pow(a, 3); // Vai ser importante para resolver o desafio
		
		System.out.println(b);
		System.out.println(c);
*/		
		
		
		
		//Meu jeito iniciante de fazer kkkkkkkk
		//1 Conta
		double a = 6;
		double b = 3 + 2;
		double c = a * b;
		double d = (double)Math.pow(c, 2);
		double e = 3 * 2;
		double f = d / e;
		
		System.out.println(f);
		
		//2 Conta
		
		double g = 1 - 5;
		double h = 2 - 7;
		double i = g * h;
		double j = 2;
		double k = i / j;
		double l = (double)Math.pow(k, 2);
		double m = (double)Math.pow(l, 2);
		
		System.out.println(l);
		
		//3 Conta
		double n = f - l;
		double o = (double)Math.pow(n, 3);
		double p = 10;
		double q = (double)Math.pow(p, 3);
		
		// 4 Conta
		
		double r = o / q ;
			
		System.out.println("A resposta da conta é: " + r);
		
		
		
		
		// Agora mostrarei o jeito do professor da Udemy - muito diferente do que eu fiz kkkkkkkk
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1-5) * (2 - 7);
		double denB = 2; 
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		System.out.println(resultado);		
		
		
		
	}
}
