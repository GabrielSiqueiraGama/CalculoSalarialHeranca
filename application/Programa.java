package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Tercerizado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Funcionario> lista = new ArrayList<>();
		System.out.println("Digite a quantidade de funcionarios: ");
		int n  = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario" + i + ": ");
			
			System.out.print("O funcionario é tercerizado? [S/N]");
			char resposta = sc.next().charAt(0);
			System.out.println("Nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite a quantidade de horas: ");
			int horas = sc.nextInt();
			System.out.println("Digite o valor por horas: ");
			double valorHoras = sc.nextDouble();
			if(resposta == 's' || resposta == 'S') {
				System.out.println("Digite o custo adicional: ");
				int custo = sc.nextInt();
				Tercerizado funcionario = new Tercerizado(nome, horas, valorHoras, custo);
				lista.add(funcionario);
			}else {
				Funcionario funcionario = new Funcionario(nome, horas, valorHoras);
				lista.add(funcionario);
			}
			
		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for(Funcionario  funcionario: lista) {
			System.out.println(funcionario.getNome() + "Recebe: " + String.format("%.2f", funcionario.Pagamento()));
		}
		
		sc.close();
	}

}
