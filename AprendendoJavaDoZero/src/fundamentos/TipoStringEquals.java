package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // O .equals ele compara se o s1 e igual o 2
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); //este next tira o espaço em branco e o nextLine não tira os espaços em brancos digitados
		System.out.println("2" == s2.trim()); //este trim ele acaba tirando o espaço em branco digitado
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
