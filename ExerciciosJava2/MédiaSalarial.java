import java.util.Scanner;

public class M�diaSalarial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double salario = 0.0;
		Double Media = 0.0;
		Double Soma = 0.0;
		Double menor = 10000000000.0;
		Double maior = 0.0;
		Integer  QuantidadeFuncionario = 0;
		System.out.println("CALCULANDO M�DIA SALARIAL DOS FUNCION�RIOS ");
		System.out.print("Digite a Quantidade de Funcion�rio: ");
		QuantidadeFuncionario = scanner.nextInt();
		
		for (int i = 0; i <QuantidadeFuncionario; i++){
			
			System.out.print("Digite o sal�rio do " + i + "� Funcion�rio: ");
			salario = scanner.nextDouble();
			Soma = Soma + salario;
			
			if (salario > maior) {
				maior = salario;
			}else if(salario < menor) {
				menor = salario;
			}
		}
		
		Media = Soma/QuantidadeFuncionario;
		System.out.println("A M�dia Salario dos Funcion�rios �: " + Media);
		System.out.println("O Maior Salario dos Funcion�rios �: " + maior);
		System.out.println("O Menor Salario dos Funcion�rios �: " + menor);
		
		
		
		scanner.close();

	}

}
