package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe as notas do aluno: ");
		float num1 = valor.nextFloat();
		float num2 =valor.nextFloat();
		float num3 = valor.nextFloat();
		atise.Media(num1, num2, num3);
	}

}
