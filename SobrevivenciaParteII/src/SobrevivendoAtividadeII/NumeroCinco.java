package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroCinco {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Digite uma letra: ");
		char letra = valor.next().charAt(0);
		atise.Vogal(letra);
		
		valor.close();

	}

}
