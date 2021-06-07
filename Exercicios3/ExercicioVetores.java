import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String [] Tarefa = new String [5];
		for (int i = 0; i < Tarefa.length; i++) {
			System.out.print("Digite a Atividade: ");
			Tarefa[i] = scanner.nextLine();
		}
		
		System.out.println("Suas tarefas são:: ");
		
		for (int i = 0; i < Tarefa.length; i++) {
			System.out.println(i + ": " + Tarefa[i]);
		}
		
		
		
		
		
		
		scanner.close();
		

	}

}
