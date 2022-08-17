package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe um número: ");
		float num = valor.nextFloat();
		atise.VerificaNumero(num);

	}

}
