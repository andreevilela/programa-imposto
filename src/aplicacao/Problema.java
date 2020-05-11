package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario, prestacaoDeServico, ganhoDeCapital, gastosMedicos, gastosEducacionais, impostoSalario, impostoServicos, impostoGanhoDeCapital;
		
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
		
		if ((salario / 12) < 3000) {
			impostoSalario = 0;
		} else if (((salario / 12) >= 3000.00) && ((salario / 12) < 5000.00)) {
			impostoSalario = salario * 0.10;
		} else {
			impostoSalario = salario * 0.20;
		}
		
		if (prestacaoDeServico > 0) {
			impostoServicos = prestacaoDeServico * 0.15;
		} else {
			impostoServicos = 0;
		}
		
		if (ganhoDeCapital > 0) {
			impostoGanhoDeCapital = ganhoDeCapital * 0.20;
		} else {
			impostoGanhoDeCapital = 0;
		}
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoDeCapital);

	}

}
