package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroNove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe 'M' para masculino e 'F' para feminino: ");
		char sexo = valor.next().charAt(0);
		System.out.println("Informe a altura: ");
		double altura = valor.nextDouble();
		System.out.println("Informe o peso: ");
		double pesoreal = valor.nextDouble();
		atise.PesoIdealSexo(pesoreal, altura, sexo);
		
		valor.close();

	}

}
