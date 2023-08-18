package Controle;

public class Break {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break; 
// o break ele faz parar bruscamente o código, ao encontrar o valor 5 ele para o processo e vai para a próxima etapa
			}
			System.out.println(i);
		}
		System.out.println("fim");
	}
}
