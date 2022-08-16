package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteCincoII {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe quanto você deseja sacar: ");
		int saque = valor.nextInt();
		if(saque <= 600 && saque >= 10) {
			atise.CaixaEletronico(saque);
		}
		else {
			System.out.println("Ops! Você só pode informar valores de 10 até 600 para o saque. Tente novamente!");
		}
	}

}
