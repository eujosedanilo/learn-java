import java.util.Scanner;

public class TransformarTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Double Celsius = 0.0;
		Double Kelvin = 0.0;
		Double Reaumur = 0.0;
		Double Rankine = 0.0;
		Double Fahrenheit = 0.0;
		
		System.out.print("Digite a Temperatura em ºC: ");
		Celsius = scanner.nextDouble();
		
		Fahrenheit = Celsius*1.8 + 32;
		Kelvin = Celsius + 273.15;
		Reaumur = Celsius * 0.8;
		Rankine = Celsius * 1.8 + 32 + 459.67;
		
		System.out.println("A temperatura em Fahrenheit: " + Fahrenheit);
		System.out.println("A temperatura em Kelvin: " + Kelvin);
		System.out.println("A temperatura em Reaumur: " + Reaumur);
		System.out.println("A temperatura em Rankine: " + Rankine);
		
		
		
		
		scanner.close();

	}

}
