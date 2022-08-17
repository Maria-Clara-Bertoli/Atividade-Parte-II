package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroOito {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe as duas notas do aluno: ");
		float nota1 = valor.nextFloat();
		float nota2 = valor.nextFloat();
		atise.AprovadoReprovado2(nota1, nota2);
		
		valor.close();

	}

}
