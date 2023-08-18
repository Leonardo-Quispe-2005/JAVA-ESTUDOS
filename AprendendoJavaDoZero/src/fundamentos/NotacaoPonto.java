package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; 
		s = s.replace("X", "Senhora"); //Se eu apenas tivesse colocado s.replace("X", "Senhora") não teria mudado nada
		s = s.toUpperCase(); //quando eu digo que s recebe(=) s.replace("X", "Senhora")- aí sim ele muda o valor de X para Senhora 
		s = s.concat("!!!"); 
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();//O "." é um operador que eu posso atribuir algo a ele
		System.out.println(x);
		
//		Posso fazer assim 1 Método
		String y = "Bom dia X".replace("X", "Leo").toUpperCase().concat("!!!");
		System.out.println(y);

//		Posso fazer assim 2 Método
		String z = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(z);
		
		
// Tipos primitivos não tem o operador "." - ou seja eu não posso 
// atribuir nada a eles - ex .replace, .ToUpperCase etc
	}
}
