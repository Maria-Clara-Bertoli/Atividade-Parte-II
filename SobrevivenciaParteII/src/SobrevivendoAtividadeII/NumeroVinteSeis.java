package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteSeis {

	public static void main(String[] args) {
	
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe o valor: ");
		float num = valor.nextFloat();
		atise.InteiroDecimal(num);
	}

}
