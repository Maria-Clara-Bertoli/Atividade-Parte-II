package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteCinco {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe um valor: ");
		int num = valor.nextInt();
		atise.ParImpar(num);
	}

}
