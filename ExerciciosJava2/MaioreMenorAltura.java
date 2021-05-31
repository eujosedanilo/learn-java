import java.util.Scanner;

public class MaioreMenorAltura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Integer sexo = 0;
		Integer QuantidadeHomem= 0;
		Integer QuantidadeMulheres = 0;
		Double altura = 0.0;
		Double Soma = 0.0;
		Double mediaHomens = 0.0;
		Double menorAltura = 10.0;
		Double MaiorAltura = 0.0;
		
		for (int i = 1; i <11; i++) {
			System.out.print("Digite o Sexo: 1 - Masculino; 2 - Feminino: ");
			sexo = scanner.nextInt();
			if(sexo ==1 || sexo ==2) {
				System.out.print("Digite a altura do altura: ");
				altura = scanner.nextDouble();
				if (sexo == 1) {
					QuantidadeHomem ++;
					Soma = Soma + altura;
					
				}else if (sexo == 2) {
					QuantidadeMulheres ++;					
				}
				
				if(altura>MaiorAltura) {
					MaiorAltura = altura;
				}else if (altura<menorAltura) {
					menorAltura = altura;
				}
			}else {
				System.out.println("Opção Invalida: Digite outro");
			}
		}
			
		mediaHomens = Soma/QuantidadeHomem;
		System.out.println("A Menor da Altura  é: " + menorAltura);
		System.out.println("A Maior da Altura  é: " + MaiorAltura);
		System.out.println("A Média da Altura dos Homens é: " + mediaHomens);
		System.out.println("O número de Mulheres é: " + QuantidadeMulheres);
		
		scanner.close();

	}
}
