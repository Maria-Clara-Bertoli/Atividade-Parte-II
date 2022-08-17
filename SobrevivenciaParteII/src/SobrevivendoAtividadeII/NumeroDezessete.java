package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDezessete {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe as duas notas: ");
		float nota1 = valor.nextFloat();
		float nota2 = valor.nextFloat();
		atise.MediaConceito(nota1, nota2);
		
		valor.close();

	}

}
