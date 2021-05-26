//Calcular a Media de 4 notas de 1 aluno. 

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String NomeAluno = "";
		Double NotaAluno = 0.0;
		Double MediaAluno = 0.0;
		Double SomaNota = 0.0;
		Integer cont = 0;
		
		System.out.print("Digite o Nome do Aluno: ");
		NomeAluno = scanner.nextLine();
		
		for(int i = 1; i < 6; i++) {
			
			System.out.print("Digite a " + i + "ª Nota: ");
			NotaAluno = scanner.nextDouble();
			SomaNota = SomaNota + NotaAluno;
			
			cont = i;
		}
		
		MediaAluno = SomaNota/cont;
		
		System.out.println(NomeAluno + ", sua média Foi: " + MediaAluno);
		
		
		scanner.close();

	}

}
