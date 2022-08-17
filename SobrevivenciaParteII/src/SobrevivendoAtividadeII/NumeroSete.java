package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroSete {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe três números diferentes: ");
		int num1 = valor.nextInt();
		int num2 = valor.nextInt();
		int num3 = valor.nextInt();
		atise.Decrescente(num1, num2, num3);
		
		valor.close();

	}

}
