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
	private int soma1;
	private int soma2;
	private int soma3;
	private float mediaconceito;
	private char conceito;
	private float aprovadoreprovado;
	private float aumento;
	private float novosalario;
	private double peso;
	private double media2;
	int vetdecrescente[] = new int[3];

	public void CompraCarne(int tipo, double quantidade, char decisao) {
		if (quantidade <= 5) {
			if (tipo == 1) {
				precototal = quantidade * 4.90;
			} else if (tipo == 2) {
				precototal = quantidade * 5.90;
			} else if (tipo == 3) {
				precototal = quantidade * 6.90;
			}
		}
		if (quantidade > 5) {
			if (tipo == 1) {
				precototal = quantidade * 5.80;
			} else if (tipo == 2) {
				precototal = quantidade * 6.80;
			} else if (tipo == 3) {
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
			} else if (tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			} else if (tipo == 3) {
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
			} else if (tipo == 2) {
				System.out.println("Tipo de carne: Alcatra");
			} else if (tipo == 3) {
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
			} else if (litro > 20) {
				descontocombustivel = (valorcombustivel / 100) * 5;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			}
		}
		if (combustivel == 'G') {
			valorcombustivel = 2.50 * litro;
			if (litro <= 20) {
				descontocombustivel = (valorcombustivel / 100) * 4;
				combustiveldescontado = valorcombustivel - descontocombustivel;
			} else if (litro > 20) {
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
		} else if (media == 10) {
			System.out.println("com distinção");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}
	}

	public void Idade(int idade1, int idade2, int idade3) {
		media = (idade1 + idade2 + idade3) / 3;
		if (media < 25) {
			System.out.println("Turma jovem");
		} else if (media >= 25 && media <= 40) {
			System.out.println("Turma adulta");
		} else if (media > 40) {
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
		} catch (ParseException ex) {
			System.out.println("Data inválida");
			return false;
		}
	}

	public void EquacaoSegundoGrau(double a, double b, double c) {
		varexp = Math.pow(b, 2);
		delta = varexp - (4 * a * c);
		if (delta < 0) {
			System.out.println("A equação não possui raízes reais");
		} else if (delta == 0) {
			x1 = (-b) / (2 * a);
			System.out.println("A raíz é " + x1);
		} else if (delta > 0) {
			varraiz = Math.sqrt(delta);
			x1 = (-b + varraiz) / (2 * a);
			x2 = (-b - varraiz) / (2 * a);
			System.out.println("As raízes são " + x1 + " e " + x2);
		}
	}

	public void Triangulo(int lado1, int lado2, int lado3) {
		soma1 = lado1 + lado2;
		soma2 = lado2 + lado3;
		soma3 = lado1 + lado3;
		if (soma1 > lado3 && soma2 > lado1 && soma3 > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Os três lados formam um triângulo equilátero");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Os três lados formam um triângulo isósceles");
			} else {
				System.out.println("Os três lados formam um triângulo escaleno");
			}
		} else {
			System.out.println("Os três lados não formam um triângulo");
		}
	}

	public void MediaConceito(float nota1, float nota2) {
		mediaconceito = (nota1 + nota2) / 2;
		if (mediaconceito > 9 && mediaconceito <= 10) {
			conceito = 'A';
		} else if (mediaconceito > 7.5 && mediaconceito <= 9) {
			conceito = 'B';
		} else if (mediaconceito > 6 && mediaconceito <= 7.5) {
			conceito = 'C';
		} else if (mediaconceito > 4 && mediaconceito <= 6) {
			conceito = 'D';
		} else if (mediaconceito >= 0 && mediaconceito <= 4) {
			conceito = 'E';
		}
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.println("Notas: " + nota1 + " e " + nota2);
			System.out.println("Média: " + mediaconceito);
			System.out.println("Conceito: " + conceito);
			System.out.println("Resultado: Aprovado!");
		} else {
			System.out.println("Notas: " + nota1 + " e " + nota2);
			System.out.println("Média: " + mediaconceito);
			System.out.println("Conceito: " + conceito);
			System.out.println("Resultado: Reprovado!");
		}
	}

	public void AprovadoReprovado(float nota1, float nota2, float nota3, float nota4) {
		aprovadoreprovado = (nota1 + nota2 + nota3 + nota4) / 4;
		if (aprovadoreprovado >= 0 && aprovadoreprovado < 3) {
			System.out.println("Reprovado!");
		} else if (aprovadoreprovado >= 3 && aprovadoreprovado <= 6.9) {
			System.out.println("Em exame!");
		} else if (aprovadoreprovado >= 7 && aprovadoreprovado <= 10) {
			System.out.println("Aprovado!");
		}
	}

	public void Procedencia(float preco, int codigo) {
		if (codigo == 1) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Sul");
		} else if (codigo == 2) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Norte");
		} else if (codigo == 3) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Leste");
		} else if (codigo == 4) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Oeste");
		} else if (codigo == 5 || codigo == 6) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Nordeste");
		} else if (codigo == 7 || codigo == 8) {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Centro-Oeste");
		} else {
			System.out.println("Preço: " + preco);
			System.out.println("Procedência: Importado");
		}
	}

	public void DiaSemana(int codigo) {
		System.out.println("O dia da semana correspondente é: ");
		if (codigo == 1) {
			System.out.println("Domingo");
		} else if (codigo == 2) {
			System.out.println("Segunda");
		} else if (codigo == 3) {
			System.out.println("Terça");
		} else if (codigo == 4) {
			System.out.println("Quarta");
		} else if (codigo == 5) {
			System.out.println("Quinta");
		} else if (codigo == 6) {
			System.out.println("Sexta");
		} else if (codigo == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor inválido!");
		}
	}

	public void Reajuste(float salario) {
		if (salario > 0 && salario <= 280) {
			aumento = (salario / 100) * 20;
			novosalario = salario + aumento;
			System.out.println("Percentual de reajuste: 20%");
		} else if (salario > 280 && salario <= 700) {
			aumento = (salario / 100) * 15;
			novosalario = salario + aumento;
			System.out.println("Percentual de reajuste: 15%");
		} else if (salario > 700 && salario < 1500) {
			aumento = (salario / 100) * 10;
			novosalario = salario + aumento;
			System.out.println("Percentual de reajuste: 10%");
		} else if (salario >= 1500) {
			aumento = (salario / 100) * 5;
			novosalario = salario + aumento;
			System.out.println("Percentual de reajuste: 5%");
		}
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Salário reajustado: " + novosalario);
	}

	public void Turno(float turno) {
		if (turno == 'M') {
			System.out.println("Bom Dia!");
		} else if (turno == 'V') {
			System.out.println("Boa Tarde!");
		} else if (turno == 'N') {
			System.out.println("Boa Noite!");
		}
	}

	public void PesoIdealSexo(double pesoreal, double altura, char tipo) {
		if (tipo == 'F') {
			peso = (62.1 * altura) - 44.7;
			System.out.println("Sexo: Feminino");
			if (pesoreal > peso) {
				System.out.println("Peso ideal: Acima");
			} else if (pesoreal < peso) {
				System.out.println("Peso ideal: Abaixo");
			} else {
				System.out.println("Peso ideal: No peso ideal");
			}
		} else {
			peso = (72.7 * altura) - 58;
			System.out.println("Sexo: Masculino");
			if (pesoreal > peso) {
				System.out.println("Peso ideal: Acima");
			} else if (pesoreal < peso) {
				System.out.println("Peso ideal: Abaixo");
			} else {
				System.out.println("Peso ideal: No peso ideal");
			}
		}
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
	}

	public void AprovadoReprovado2(float nota1, float nota2) {
		media2 = (nota1 + nota2) / 2;
		if (media2 >= 7) {
			System.out.println("Aprovado!");
		} else if (media2 < 7) {
			System.out.println("Reprovado!");
		}
	}

	public void Decrescente(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			vetdecrescente[0] = num1;
			if (num2 > num3) {
				vetdecrescente[1] = num2;
				vetdecrescente[2] = num3;
			} else {
				vetdecrescente[2] = num2;
				vetdecrescente[1] = num3;
			}
		} else if (num2 > num1 && num2 > num3) {
			vetdecrescente[0] = num2;
			if (num1 > num3) {
				vetdecrescente[1] = num1;
				vetdecrescente[2] = num3;
			} else {
				vetdecrescente[2] = num1;
				vetdecrescente[1] = num3;
			}
		} else if (num3 > num1 && num3 > num2) {
			vetdecrescente[0] = num3;
			if (num2 > num1) {
				vetdecrescente[1] = num2;
				vetdecrescente[2] = num1;
			} else {
				vetdecrescente[2] = num2;
				vetdecrescente[1] = num1;
			}
		}
		System.out.println(vetdecrescente[0]);
		System.out.println(vetdecrescente[1]);
		System.out.println(vetdecrescente[2]);
	}
	
	public int Transforma(int num) {
		return num + 1;
	}
}
