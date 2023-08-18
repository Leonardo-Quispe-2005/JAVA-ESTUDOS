package Controle;

public class Continue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {	
			if (i % 2 == 1) {
				continue; //o continue ao dar verdadeiro ele ira continuar, más quando o valor for falso ele irá direto para o println
			}
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {	
			if (i == 5) {
				continue; //o continue ao dar verdadeiro ele ira continuar, más quando o valor for falso ele irá direto para o println, aqui no caso sera o 5
			}
			System.out.println(i);
		}
	}
}
