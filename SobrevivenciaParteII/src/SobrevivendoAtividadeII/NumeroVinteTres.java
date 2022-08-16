package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe as idades: ");
		int ida1 = valor.nextInt();
		int ida2 = valor.nextInt();
		int ida3 = valor.nextInt();
		atise.Idade(ida1, ida2, ida3);

	}

}
