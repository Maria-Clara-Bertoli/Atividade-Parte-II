package SobrevivendoAtividadeII;

import java.util.Scanner;

public class NumeroVinteSete {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeSelecao atise = new AtividadeSelecao();
		
		System.out.println("Informe qual opera��o voc� deseja realizar: ");
		System.out.println("1 - Par ou �mpar");
		System.out.println("2 - Positivo ou Negativo");
		System.out.println("3 - Inteiro ou Decimal");
		int operacao = valor.nextInt();
		float vet[] = new float [2];
		System.out.println("Informe dois valores: ");
		for(int i = 0; i < 2; i++) {
			vet[i] = valor.nextFloat();
		}
		atise.Operacao(vet, operacao);
	}

}
