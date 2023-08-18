package Controle;

public class BreakRotulado {
	public static void main(String[] args) {
		//devo sempre evitar de usar o Break e o continue
		
		externo: for (int i = 0; i < 3; i++) { // esse externo é como se eu estivesse dando um nome para este laço
	/*interno:*/	for (int j = 0; j < 3; j++) {
				if (i ==1) {
					break externo; //aqui ele vai entender que eu quero fazer um break no laço externo e não no interno
				}
			System.out.printf("[%d %d]", i, j);
		}
		
			System.out.println();
			
		}
		
		System.out.println("fim");
		
		
	}
}
