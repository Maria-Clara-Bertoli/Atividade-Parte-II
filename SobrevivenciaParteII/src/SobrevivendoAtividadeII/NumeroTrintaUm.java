package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroTrintaUm {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();

		System.out.println("Informe o tipo de carne que voc� deseja comprar: ");
		int tipo = valor.nextInt();
		System.out.println("Informe a quantidade de carne que voc� deseja comprar: ");
		double quantidade = valor.nextDouble();
		System.out.println("O pagamento ser� efetuado atrav�s do cart�o 'Tabajara'? ");
		char decisao = valor.next().charAt(0);
		atise.CompraCarne(tipo, quantidade, decisao);

	}

}
