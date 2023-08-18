package fundamentos;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio");
		System.out.println(++a == b--); //quando eu coloco esse ++ antes do A ele vê que é importante e faz primeiro, quando eu coloco o -- depois do B ele não é de tante importância, e por isso da true - pesquisar depois melhor
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
