package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		//Leonardo
		d1.nome = "Leonardo";
		d1.dia = 17;
		d1.mes = "Maio";
		d1.ano = 2005;
		
		//Lucas
		var d2 = new Data();
		d2.nome = "Lucas";
		d2.dia = 12;
		d2.mes = "Fevereiro";
		d2.ano = 2012;
		
		//Davi
		var d3 = new Data();
		d3.nome = "Davi";
		d3.dia = 30;
		d3.mes = "Dezembro";
		d3.ano = 2019;
		
		System.out.printf("O nome dos 3 irmaos sao: %s, %s e %s", 
				d1.nome, d2.nome, d3.nome );
		 
		
	}
}
