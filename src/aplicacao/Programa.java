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
		
		sc.close();
	}

}
