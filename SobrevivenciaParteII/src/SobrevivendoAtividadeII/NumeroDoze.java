package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroDoze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe o seu sal�rio mensal: ");
		float salario = valor.nextFloat();
		atise.Reajuste(salario);
		
		valor.close();

	}

}
