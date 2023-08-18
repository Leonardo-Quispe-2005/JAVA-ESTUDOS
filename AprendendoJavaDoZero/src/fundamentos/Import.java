package fundamentos;
// O importe sempre ficará fora da classe - ele ficará sempre aqui em package
import java.util.Date;

/*Usarei bastante pois quanto mais crescer o meu programa
 * cada classe representara uma parte do meu programa e caso for
 * necessário interagir entre elas darei sempre o import de cada
 * classe*/

// tambem importarei funcionalidades do próprio JAVA - ex: Date

// devo sempre importar o tipo certo que eu precisarei usar


public class Import {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}
}
