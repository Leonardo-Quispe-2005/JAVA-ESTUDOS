package Controle;

public class For3 {
	public static void main(String[] args) {
//Uma das partes mais interessante é debugar o meu código pois ele
//me mostrara o passo a passo de cada etapa do meu código
//devo praticar mais essa técnica e devo implementar o máximo que possivel
		
		
//o escopo é de grande importância na programação, pois ela é a 
//lógica do nosso programa - é a sequencia de passo a passo
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
	}
}
