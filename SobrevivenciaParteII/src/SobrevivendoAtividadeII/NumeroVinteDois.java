package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe um número menor do que 1000");
		int num = valor.nextInt();
		if(num > 999) {
			System.out.println("Este número é inválido, tente novamente!");
		}
		else {
			atise.QuantidadePartes(num);
		}
	}

}
