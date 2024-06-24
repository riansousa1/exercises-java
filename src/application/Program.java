package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Conferencia;
import entities.Evento;
import entities.Show;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Evento> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		int n = 0;

		while (n != 4) {
			System.out.println("Menu:");
			System.out.println("1. Criar Conferência");
			System.out.println("2. Criar Show");
			System.out.println("3. Mostrar Eventos");
			System.out.println("4. Sair");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n == 1) {
				System.out.print("Nome da Conferência: ");
				String nomeC = sc.nextLine();
				System.out.print("Data (dd/MM/yyyy): ");
				Date dataC = sdf.parse(sc.next());
				sc.nextLine();
				System.out.print("Palestrante: ");
				String palestrante = sc.nextLine();
				list.add(new Conferencia(nomeC, dataC, palestrante));
				System.out.println("Conferência criada com sucesso!");				
			} else if (n == 2) {
				System.out.print("Nome do Show: ");
				String nomeS = sc.nextLine();
				System.out.print("Data (dd/MM/yyyy): ");
				Date dataS = sdf.parse(sc.next());
				sc.nextLine();
				System.out.print("Banda: ");
				String banda = sc.nextLine();
				list.add(new Show(nomeS, dataS, banda));
				System.out.println("Show criado com sucesso!");
			} else if (n == 3) {
				for (Evento e : list) {
					System.out.println(e);
				}
			}

		}
		System.out.println("Saindo...");
		sc.close();
	}

}
