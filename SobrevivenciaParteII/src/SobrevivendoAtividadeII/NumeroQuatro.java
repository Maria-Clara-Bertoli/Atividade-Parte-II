package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe o ano que será verificado");
		int ano = valor.nextInt();
		atise.AnoBissexto(ano);
	}

}
