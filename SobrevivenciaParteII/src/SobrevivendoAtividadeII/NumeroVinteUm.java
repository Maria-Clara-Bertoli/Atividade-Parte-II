package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteUm {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe uma data no formato 'dd/MM/yyyy': ");
		String data = valor.nextLine();
		atise.DataValida(data);
	}

}
