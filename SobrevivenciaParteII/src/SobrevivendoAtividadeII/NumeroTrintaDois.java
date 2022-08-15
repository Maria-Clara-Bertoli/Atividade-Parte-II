package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroTrintaDois {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();

		System.out.println("Informe as respostas das questões: ");
		for (int i = 1; i < 11; i++) {
			System.out.println("Questão " + i);
			char x = valor.next().charAt(0);
			atise.Avaliacao(x, i);
		}

	}

}
