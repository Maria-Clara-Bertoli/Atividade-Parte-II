package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDezoito {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe os tr�s lados de um tri�ngulo: ");
		int lado1 = valor.nextInt();
		int lado2 = valor.nextInt();
		int lado3 = valor.nextInt();
		atise.Triangulo(lado1, lado2, lado3);
		
		valor.close();
	}

}
