package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroQuinze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe o código do produto: ");
		int codigo = valor.nextInt();
		System.out.println("Informe o valor do produto: ");
		float preco = valor.nextFloat();
		atise.Procedencia(preco, codigo);
		
		valor.close();

	}

}
