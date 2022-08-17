package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroOnze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe o turno no qual você estuda com 'M' para 'Matutino', 'V' para 'Vespertino' e 'N' para 'Noturno'");
		char turno = valor.next().charAt(0);
		atise.Turno(turno);
	}

}
