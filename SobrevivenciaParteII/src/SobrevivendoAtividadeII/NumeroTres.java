package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe 'F' ou 'M': ");
		char sexo = valor.next().charAt(0);
		
		atise.Sexo(sexo);
	}

}
