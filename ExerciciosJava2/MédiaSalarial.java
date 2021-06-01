import java.util.Scanner;

public class MédiaSalarial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double salario = 0.0;
		Double Media = 0.0;
		Double Soma = 0.0;
		Double menor = 10000000000.0;
		Double maior = 0.0;
		Integer  QuantidadeFuncionario = 0;
		System.out.println("CALCULANDO MÉDIA SALARIAL DOS FUNCIONÁRIOS ");
		System.out.print("Digite a Quantidade de Funcionário: ");
		QuantidadeFuncionario = scanner.nextInt();
		
		for (int i = 0; i <QuantidadeFuncionario; i++){
			
			System.out.print("Digite o salário do " + i + "º Funcionário: ");
			salario = scanner.nextDouble();
			Soma = Soma + salario;
			
			if (salario > maior) {
				maior = salario;
			}else if(salario < menor) {
				menor = salario;
			}
		}
		
		Media = Soma/QuantidadeFuncionario;
		System.out.println("A Média Salario dos Funcionários é: " + Media);
		System.out.println("O Maior Salario dos Funcionários é: " + maior);
		System.out.println("O Menor Salario dos Funcionários é: " + menor);
		
		
		
		scanner.close();

	}

}
