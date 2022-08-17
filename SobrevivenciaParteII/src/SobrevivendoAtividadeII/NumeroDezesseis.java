package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDezesseis {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe as quatro notas do aluno: ");
		float nota1 = valor.nextFloat();
		float nota2 = valor.nextFloat();
		float nota3 = valor.nextFloat();
		float nota4 = valor.nextFloat();
		atise.AprovadoReprovado(nota1, nota2, nota3, nota4);
		
		valor.close();

	}

}
