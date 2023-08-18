package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		//Muito raro usar o Switch sem o break 
		//O switch não retorna o verdadeiro ou falso ele retorna um valor
		// O switch sem o break ele faz todo o processo de case abaixo dele
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
			
		case "roxa":
			System.out.println("Sei o Heian Godan");
			
		case "verde":
			System.out.println("Sei o Heian Yodan");
			
		case "laranja":
			System.out.println("Sei o Heian Sandan");
			
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
			
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			
	//	case "branca":
	//		System.out.println("Não sei de nada");
		}
		System.out.println("fim");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
			
		case 2:
			System.out.println("Sabe falar");
			
		case 1:
			System.out.println("Sabe andar");
			
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}
}
