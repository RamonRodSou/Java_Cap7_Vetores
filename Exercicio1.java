package Vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] tarefa = new String [5];
//		tarefa[0] = "Lavar Roupa";
//		tarefa[1] = "Limpa Casa";
//		tarefa[2] = "Lavar louça";
//		tarefa[3] = "Cozinhar";
//		tarefa[4] = "Estudar";
		
		for (int i = 0; i < tarefa.length ; i++) {
		
		System.out.print("Tarefa " + i + ": ");
		tarefa[i] = scanner.nextLine();
				
		}
		System.out.println("Suas tarefas são: ");
		for (int i = 0; i < tarefa.length; i++) {
			System.out.println(i + ": " + tarefa[i]);
		}
		
		scanner.close();

	}

}
