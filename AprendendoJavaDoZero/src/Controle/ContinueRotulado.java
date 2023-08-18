package Controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		//devo sempre evitar de usar o Break e o continue
		
		externo: for (int i = 0; i < 3; i++) { // esse externo é como se eu estivesse dando um nome para este laço
	/*interno:*/	for (int j = 0; j < 3; j++) {
				if (i ==1) {
					continue externo; //o continue fez que apenas aquela interação fosse interrompida e não todas que vem depois como o break
				}
			System.out.printf("[%d %d]", i, j);
		}
		
			System.out.println();
			
		}
		
		System.out.println("fim");
		
		
	}
}
