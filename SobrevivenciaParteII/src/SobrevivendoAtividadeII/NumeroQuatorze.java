package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroQuatorze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe um número: ");
		int codigo = valor.nextInt();
		atise.DiaSemana(codigo);
		
		valor.close();

	}

}
