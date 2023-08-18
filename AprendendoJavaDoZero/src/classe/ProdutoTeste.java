package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();//Sempre que eu chamar um Método ele sempre tera parenteses - no caso é o Produto()
		p1.nome = "Notebook";//Para acessar os atributos de uma classe utilizamos o ponto - no caso é o p1.nome
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
