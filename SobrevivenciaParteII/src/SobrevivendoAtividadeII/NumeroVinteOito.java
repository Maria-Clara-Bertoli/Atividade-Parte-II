package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteOito {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		int cont = 0;
		System.out.println("Responda com 'S' ou 'N': ");
		System.out.println("Telefonou para a v�tima? ");
		char a = valor.next().charAt(0);
		if (a == 'S') {
			cont = cont + 1;
		}
		System.out.println("Esteve no local do crime? ");
		char b = valor.next().charAt(0);
		if (b == 'S') {
			cont = cont + 1;
		}
		System.out.println("Mora perto da v�tima? ");
		char c = valor.next().charAt(0);
		if (c == 'S') {
			cont = cont + 1;
		}
		System.out.println("Devia para a v�tima? ");
		char d = valor.next().charAt(0);
		if (d == 'S') {
			cont = cont + 1;
		}
		System.out.println("J� trabalhou com a v�tima? ");
		char e = valor.next().charAt(0);
		if (e == 'S') {
			cont = cont + 1;
		}
		atise.Crime(cont);

	}

}
