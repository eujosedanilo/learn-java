//Imprima a Tabuada do numero que o usuário informar. 
import java.util.Scanner;

public class TabuadaMultipplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Integer multiplicar = 0;
		
		System.out.print("Digite o Numero que deseja Multiplicar: ");
		Integer numero = scanner.nextInt();
		
		System.out.println("Tabuada de " + numero);
		
		for (int i = 1; i < 11 ; i++) {
			
			multiplicar = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicar );
			
			
			
		}
		
		
		scanner.close();

	}

}
