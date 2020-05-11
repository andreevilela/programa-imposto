package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario, prestacaoDeServico, ganhoDeCapital, gastosMedicos, gastosEducacionais, impostoSalario, impostoServicos, impostoGanhoDeCapital, maximoDedutivel, gastosDedutiveis, impostoTotal, impostoDevido;
		
		System.out.println("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.println("Renda anual com presta��o de servi�o: ");
		prestacaoDeServico = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		ganhoDeCapital = sc.nextDouble();
		System.out.println("Gastos m�dicos: ");
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
		
		impostoTotal = impostoSalario + impostoServicos + impostoGanhoDeCapital;
		maximoDedutivel = impostoTotal * 0.30;
		gastosDedutiveis = gastosMedicos + gastosEducacionais;
		impostoDevido = impostoTotal - maximoDedutivel;
		
		System.out.println();
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoDeCapital);
		System.out.println();
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoTotal);
		System.out.printf("Abatimento: %.2f%n", maximoDedutivel);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);

	}

}
