import java.util.Scanner;

public class AreadoTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double AlturaParede;
		double LarguraParede;
		double AlturaAzuleijo;
		double LarguraAzuleijo;
		double AreaParede;
		double AreaAzuleijo;
		double quantidadeZuleijo;
		
		System.out.print("Digite a Altura da Parede: ");
		AlturaParede = scanner.nextInt();
		System.out.print("Digite a Largura da Parede: ");
		LarguraParede = scanner.nextInt();
		
		System.out.print("Digite a Altura da Azuleijo: ");
		AlturaAzuleijo = scanner.nextInt();
		System.out.print("Digite a Largura da Azuleijo: ");
		LarguraAzuleijo = scanner.nextInt();
		
		AreaParede = AlturaParede * LarguraParede;
		
		AreaAzuleijo = AlturaAzuleijo * LarguraAzuleijo;
		
		
		quantidadeZuleijo = AreaParede/AreaAzuleijo;
		
		System.out.println("A Quantidade de Azuleijo é: " + quantidadeZuleijo);
		
		
		
		scanner.close();

	}

}
