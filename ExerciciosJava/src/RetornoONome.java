//Imprima o "Bem vindo ao Java" Com o nome do usuario digitado. 

import java.util.Scanner;

public class RetornoONome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o seu Nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Bem vindo ao Java,  " + nome + "!");
		
		
		
		scanner.close();
		
		

	}

}
