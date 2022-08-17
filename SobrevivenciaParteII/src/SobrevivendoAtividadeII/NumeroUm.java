package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroUm {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe dois valores: ");
		int num1 = valor.nextInt();
		int num2 = valor.nextInt();
		atise.MaiorValor(num1, num2);
		
		valor.close();
	}

}
