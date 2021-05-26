//Mudar o valor de 2 variaveis. A varivel 1 vai assumir o valor da 2. 

import java.util.Scanner;

public class MudarValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String nome1 = "Mestre do Universo";
		String nome2 = "";
		System.out.print("Digite o Nome para ser associado: ");
		nome2 = scanner.nextLine();
		String aux = nome1;
		nome1 = nome2;
		nome2 = aux;
		
		System.out.println("Oi " + nome1 + ", " + nome2 + "!");
		
		
		scanner.close();

	}

}
