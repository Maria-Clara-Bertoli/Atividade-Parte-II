package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteNove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Defina o tipo de combust�vel. 'A' para '�lcool' e 'G' para 'gasolina': ");
		char combustivel = valor.next().charAt(0);
		System.out.println("Informe quantos litros voc� deseja comprar: ");
		int litro = valor.nextInt();
		atise.CompraCombustivel(combustivel, litro);
	}

}
