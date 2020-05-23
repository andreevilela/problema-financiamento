package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String cliente;
		double salario, porcentagem, total;
		int prestacoes, opcao = 0;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente: ");
		cliente = sc.nextLine();
		System.out.println("Salário: ");
		salario = sc.nextDouble();
		while (salario < 0) {
			System.out.println("O salário não deve ser negativo. Tente novamente: ");
			salario = sc.nextDouble();
		}
		
		System.out.println("Número de Prestações: ");
		prestacoes = sc.nextInt();	
		System.out.println("Porcentagem de entrada: ");
		porcentagem = sc.nextDouble();
		System.out.println("Valor total financiado: ");
		total = sc.nextDouble();
		while (total / prestacoes > salario * 0.3) {
			System.out.println("O valor total financiado não pode exceder 30% do sálario em cada prestação. Tente novamente: ");
			total = sc.nextDouble();
		}
		
		while (opcao < 4) {
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao = sc.nextInt();
			while (opcao > 4 || opcao < 1) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				
				System.out.println();
				System.out.println("MENU:");
				System.out.println("1 - Mostrar valor da entrada");
				System.out.println("2 - Mostrar valor financiado");
				System.out.println("3 - Mostrar valor de cada prestação");
				System.out.println("4 - Sair");
				System.out.println("Digite uma opcao: ");
				opcao = sc.nextInt();
			}
			
			if (opcao == 1) {
				System.out.printf("%nENTRADA = R$ %.2f%n", total * (porcentagem / 100));
			} else if (opcao == 2) {
				System.out.printf("%nVALOR FINANCIADO = R$ %.2f%n", total - total * (porcentagem / 100));
			} else if (opcao == 3) {
				System.out.printf("%nVALOR DE CADA PRESTACAO = R$ %.2f%n", (total - total * (porcentagem / 100)) / prestacoes);
			} else {
				System.out.printf("%nFIM DO PROGRAMA!%n");
			}
		
		}
		
		sc.close();
	}

}
