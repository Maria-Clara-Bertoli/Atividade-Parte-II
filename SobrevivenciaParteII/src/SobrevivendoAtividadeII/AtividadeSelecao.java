package SobrevivendoAtividadeII;

public class AtividadeSelecao {
	
	private double precototal;
	private double valorapagar;
	private double valordodesconto;

	public void CompraCarne(int tipo, double quantidade, char decisao) {
		if (quantidade <= 5) {
			if (tipo == 1) {
				precototal = quantidade * 4.90;
			}
			if (tipo == 2) {
				precototal = quantidade * 5.90;
			}
			if (tipo == 3) {
				precototal = quantidade * 6.90;
			}
		}
		if (quantidade > 5) {
			if (tipo == 1) {
				precototal = quantidade * 5.80;
			}
			if (tipo == 2) {
				precototal = quantidade * 6.80;
			}
			if (tipo == 3) {
				precototal = quantidade * 7.80;
			}
		}
		if (decisao == 'S') {
			valordodesconto = (precototal/100)*5;
			valorapagar = precototal - valordodesconto;
			System.out.println("--------------");
			System.out.println("CUPOM FISCAL");
			System.out.println("--------------");
			if(tipo == 1) {
			System.out.println("Tipo de carne: Filé Duplo");
			}
			if(tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			}
			if(tipo == 3) {
				System.out.println("Tipo de carne: Picanha");
			}
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Preço total: " + precototal);
			System.out.println("Tipo de pagamento: Cartão");
			System.out.println("Valor do desconto: " + valordodesconto);
			System.out.println("Valor a pagar: " + valorapagar);
		}
		else {
			System.out.println("--------------");
			System.out.println("CUPOM FISCAL");
			System.out.println("--------------");
			if(tipo == 1) {
			System.out.println("Tipo de carne: Filé Duplo");
			}
			if(tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			}
			if(tipo == 3) {
				System.out.println("Tipo de carne: Picanha");
			}
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Tipo de pagamento: À vista");
			System.out.println("Valor a pagar: " + precototal);
		}
	}
	
	public void Avaliacao(char x, int i) {
		if (i == 1) {
			if (x == 'a') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (a)");
			}
		}
		if (i == 2) {
			if (x == 'a') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (a)");
			}
		}
		if (i == 3) {
			if (x == 'b') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (b)");
			}
		}
		if (i == 4) {
			if (x == 'b') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (b)");
			}
		}
		if (i == 5) {
			if (x == 'c') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (c)");
			}
		}
		if (i == 6) {
			if (x == 'c') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (c)");
			}
		}
		if (i == 7) {
			if (x == 'd') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (d)");
			}
		}
		if (i == 8) {
			if (x == 'd') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (d)");
			}
		}
		if (i == 9) {
			if (x == 'e') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (e)");
			}
		}
		if (i == 10) {
			if (x == 'e') {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errada, resposta correta (e)");
			}
		}
	}


}
