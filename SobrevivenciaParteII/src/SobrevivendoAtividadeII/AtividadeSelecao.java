package SobrevivendoAtividadeII;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AtividadeSelecao {

	private double precototal;
	private double valorapagar;
	private double valordodesconto;
	private double valorcombustivel;
	private double descontocombustivel;
	private double combustiveldescontado;
	private int cem;
	private int cinquenta;
	private int dez;
	private int cinco;
	private int um;
	private float media;
	private int centenas;
	private int dezenas;
	private int unidades;
	private double delta;
	private double x1;
	private double x2;
	private double varexp;
	private double varraiz;

	public void CompraCarne(int tipo, double quantidade, char decisao) {
		if (quantidade <= 5) {
			if (tipo == 1) {
				precototal = quantidade * 4.90;
			}
			else if (tipo == 2) {
				precototal = quantidade * 5.90;
			}
			else if (tipo == 3) {
				precototal = quantidade * 6.90;
			}
		}
		if (quantidade > 5) {
			if (tipo == 1) {
				precototal = quantidade * 5.80;
			}
			else if (tipo == 2) {
				precototal = quantidade * 6.80;
			}
			else if (tipo == 3) {
				precototal = quantidade * 7.80;
			}
		}
		if (decisao == 'S') {
			valordodesconto = (precototal / 100) * 5;
			valorapagar = precototal - valordodesconto;
			System.out.println("--------------");
			System.out.println("CUPOM FISCAL");
			System.out.println("--------------");
			if (tipo == 1) {
				System.out.println("Tipo de carne: Filé Duplo");
			}
			else if (tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			}
			else if (tipo == 3) {
				System.out.println("Tipo de carne: Picanha");
			}
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Preço total: " + precototal);
			System.out.println("Tipo de pagamento: Cartão");
			System.out.println("Valor do desconto: " + valordodesconto);
			System.out.println("Valor a pagar: " + valorapagar);
		} else {
			System.out.println("--------------");
			System.out.println("CUPOM FISCAL");
			System.out.println("--------------");
			if (tipo == 1) {
				System.out.println("Tipo de carne: Filé Duplo");
			}
			else if (tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			}
			else if (tipo == 3) {
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
			} else {
				System.out.println("Errada, resposta correta (a)");
			}
		}
		if (i == 2) {
			if (x == 'a') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (a)");
			}
		}
		if (i == 3) {
			if (x == 'b') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (b)");
			}
		}
		if (i == 4) {
			if (x == 'b') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (b)");
			}
		}
		if (i == 5) {
			if (x == 'c') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (c)");
			}
		}
		if (i == 6) {
			if (x == 'c') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (c)");
			}
		}
		if (i == 7) {
			if (x == 'd') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (d)");
			}
		}
		if (i == 8) {
			if (x == 'd') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (d)");
			}
		}
		if (i == 9) {
			if (x == 'e') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (e)");
			}
		}
		if (i == 10) {
			if (x == 'e') {
				System.out.println("Correto");
			} else {
				System.out.println("Errada, resposta correta (e)");
			}
		}
	}

	public void Crime(int cont) {
		if (cont == 2) {
			System.out.println("Você é suspeita!");
		}
		if (cont == 3 || cont == 4) {
			System.out.println("Você é cúmplice!");
		}
		if (cont == 5) {
			System.out.println("Você é o/a assassina(o)!");
		}
		if (cont == 0) {
			System.out.println("Você é inocente!");
		}
	}

	public void CompraCombustivel(char combustivel, int litro) {
		if (combustivel == 'A') {
			valorcombustivel = 1.90 * litro;
			if (litro <= 20) {
				descontocombustivel = (valorcombustivel / 100) * 3;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			}
			else if (litro > 20) {
				descontocombustivel = (valorcombustivel / 100) * 5;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			}
		}
		if (combustivel == 'G') {
			valorcombustivel = 2.50 * litro;
			if (litro <= 20) {
				descontocombustivel = (valorcombustivel / 100) * 4;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			}
			else if (litro > 20) {
				descontocombustivel = (valorcombustivel / 100) * 6;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			}
		}
		System.out.println("Valor a pagar: " + combustiveldescontado);
	}

	public void Operacao(float vet[], int operacao) {
		if (operacao == 1) {
			for (int i = 0; i < 2; i++) {
				if (vet[i] % 2 == 0) {
					System.out.println("O número " + vet[i] + " é par");
				} else {
					System.out.println("O número " + vet[i] + " é ímpar");
				}
			}
		}
		if (operacao == 2) {
			for (int i = 0; i < 2; i++) {
				if (vet[i] > 0) {
					System.out.println("O número " + vet[i] + " é positivo");
				} else {
					System.out.println("O número " + vet[i] + " é negativo");
				}
			}
		}
		if (operacao == 3) {
			for (int i = 0; i < 2; i++) {
				int x = (int) vet[i];
				if (vet[i] == x) {
					System.out.println("O número " + vet[i] + " é inteiro");
				} else {
					System.out.println("O número " + vet[i] + " é decimal");
				}
			}
		}
	}

	public void InteiroDecimal(float num) {
		int x = (int) num;
		if (num == x) {
			System.out.println("O número " + num + " é inteiro");
		} else {
			System.out.println("O número " + num + " é decimal");
		}
	}

	public void ParImpar(int num) {
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par");
		} else {
			System.out.println("O número " + num + " é ímpar");
		}
	}

	public void CaixaEletronico(int dinheiro) {
		if (dinheiro >= 100) {
			cem = dinheiro / 100;
			dinheiro = dinheiro % 100;
		}
		if (dinheiro >= 50) {
			cinquenta = dinheiro / 50;
			dinheiro = dinheiro % 50;
		}
		if (dinheiro >= 10) {
			dez = dinheiro / 10;
			dinheiro = dinheiro % 10;
		}
		if (dinheiro >= 5) {
			cinco = dinheiro / 5;
			dinheiro = dinheiro % 5;
		}
		if (dinheiro >= 1) {
			um = dinheiro / 1;
			dinheiro = dinheiro % 1;
		}
		System.out.println("Notas de 'cem': " + cem);
		System.out.println("Notas de 'cinquenta': " + cinquenta);
		System.out.println("Notas de 'dez': " + dez);
		System.out.println("Notas de 'cinco': " + cinco);
		System.out.println("Notas de 'um': " + um);
	}

	public void Media(float nota1, float nota2, float nota3) {
		media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media == 10) {
			System.out.println("com distinção");
		}
		else if (media < 7) {
			System.out.println("Reprovado");
		}
	}

	public void Idade(int idade1, int idade2, int idade3) {
		media = (idade1 + idade2 + idade3) / 3;
		if (media < 25) {
			System.out.println("Turma jovem");
		}
		else if (media >= 25 && media <= 40) {
			System.out.println("Turma adulta");
		}
		else if (media > 40) {
			System.out.println("Turma idosa");
		}
	}

	public void QuantidadePartes(int num) {
		if (num >= 100) {
			centenas = num / 100;
			num = num % 100;
		}
		if (num >= 10) {
			dezenas = num / 10;
			num = num % 10;
		}
		if (num >= 1) {
			unidades = num / 1;
			num = num % 1;
		}
		System.out.println("Centenas: " + centenas);
		System.out.println("Dezenas: " + dezenas);
		System.out.println("Unidades: " + unidades);
	}

	public boolean DataValida(String data) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			sdf.parse(data);
			System.out.println("Data válida");
			return true;
			} 
		catch(ParseException ex) {
			System.out.println("Data inválida");
			return false;
		}
	}
	
	public void EquacaoSegundoGrau(int a, int b, int c) {
		varexp = Math.pow(b, 2);
		delta = varexp - (4*a*c);
		if(delta < 0) {
			System.out.println("A equação não possui raízes reais");
		}
		else if(delta == 0) {
			varraiz = Math.sqrt(delta);
			x1 = (-b + varraiz)/2*a;
			x2 = (-b - varraiz)/2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
		else if(delta > 0) {
			varraiz = Math.sqrt(delta);
			x1 = (-b + varraiz)/2*a;
			x2 = (-b - varraiz)/2*a;
			System.out.println(varraiz);
			System.out.println(delta);
			System.out.println(x1);
			System.out.println(x2);
		}
	}
}
