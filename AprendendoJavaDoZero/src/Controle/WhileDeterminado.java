package Controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador <= 10){
			System.out.printf("i = %d\n", contador);
			contador ++ ; // contador ++ vai de 1 em 1 --- e --- contador += 2 vai de 2 em 2
		}
		// Vale lembrar que para essa operações também posso usar o FOR, bem mais fácil
	}
}
