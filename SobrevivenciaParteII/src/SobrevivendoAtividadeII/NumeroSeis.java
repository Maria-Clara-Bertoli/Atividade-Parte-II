package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroSeis {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe um número inteiro: ");
		int num = valor.nextInt();
		System.out.println(atise.Transforma(num));
		
		valor.close();

	}

}
