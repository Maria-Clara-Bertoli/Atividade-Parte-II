package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroTrintaDois {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();

		System.out.println("Informe as respostas das quest�es: ");
		for (int i = 1; i < 11; i++) {
			System.out.println("Quest�o " + i);
			char x = valor.next().charAt(0);
			atise.Avaliacao(x, i);
		}

	}

}
