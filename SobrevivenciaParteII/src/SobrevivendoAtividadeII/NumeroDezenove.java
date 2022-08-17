package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDezenove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe os parâmetros para a fórmula da equação");
		System.out.println("Valor de 'a': ");
		double a = valor.nextDouble();
		if (a == 0) {
			System.out.println("Esta equação não pode ser uma equação do segundo grau");
		}
		else {
		System.out.println("Valor de 'b': ");
		double b = valor.nextDouble();
		System.out.println("Valor de 'c': ");
		double c = valor.nextDouble();
		atise.EquacaoSegundoGrau(a, b, c);
		}
	}

}
