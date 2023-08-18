package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
//Tudo em Java é objeto, menos os tipos primitivos
//Objeto "normal"
		String s = new String("Leo");
		s.toUpperCase();
		
//E os wrappers são para a versão objeto dos tipos primitivos
// Exemplo de tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
