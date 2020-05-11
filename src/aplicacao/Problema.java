package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario, prestacaoDeServico, ganhoDeCapital, gastosMedicos, gastosEducacionais;
		
		System.out.println("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		prestacaoDeServico = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		ganhoDeCapital = sc.nextDouble();
		System.out.println("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

	}

}
