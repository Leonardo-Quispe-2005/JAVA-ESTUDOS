
package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hola me llamo Leonardo".charAt(0)); // o numero colocado dentro do charAt(0) mostra qual a letra que está na posição
		
		String s ="Boa tarde";
		System.out.println(s.concat("!!!")); //estou concatenando o !!! com o Boa tarde
		System.out.println(s + "!!!"); // outro método de concatenção
		System.out.println(s.startsWith("Boa")); //Aqui ele tá me falando se é verdadeiro que a frase começa com Boa
		System.out.println(s.toLowerCase().startsWith("boa")); // Aqui ele deixa todas as letras minuscula com o lowercase e depois verifico se a frase começa com boa
		System.out.println(s.toUpperCase().endsWith("TARDE")); // Aqui ele deixa todas as letras maiusculas com o upercase e depois verifico se a frase termina com TARDE
		System.out.println(s.length()); // mostra a quantidade de caracter
		System.out.println(s.toLowerCase().equals("boa tarde")); // eu deixo a frase em minusculo logo vejo se ela está igual ao parametro
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Eu ignoro se a frase está maiuscula o minuscula
		
		var nome = "Leonardo";
		var sobrenome ="Quispe";
		var idade = 18;
		var salario = 987.8932;
		
		
//		Concatenar variaveis
		
		System.out.println("Nome: " + nome +
				"\nSobrenome: " + sobrenome 			//Não gosto muito de fazer assim, demora muito
				+"\nIdade: " + idade 
				+"\nSalario: " + salario+"\n");
		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome,idade,salario); //jeito mais bonito e legivel para concatenar variaveis
		
		
		
	}
}
